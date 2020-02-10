package abc154.e

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val s = sc.nextLine
    val n = s.size
    val K = sc.nextInt

    val dp = Array.fill(n + 1, 4, 2)(0)
    dp(0)(0)(0) = 1
    for (i <- 0 until n; j <- 0 until 4; k <- 0 until 2) {
      val nd = s(i) - '0'
      for (d <- 0 until 10) {
        // 配る先
        var ni = i + 1
        var nj = j
        var nk = k

        if (d != 0) {
          // 次に選ぶ数字が0出ない場合は、非0をカウントアップした先に配る
          nj += 1
        }

        if (nj <= K) { // 配った結果非0がKを超える場合は配れないよ
          if (k == 0) {
            if (d <= nd) { // 配り元までの桁がsと同じだったら、配る先はsの同じ桁の数字を超えられない
              if (d < nd) {
                // 配る先では桁数がsと異なるため +1
                nk += 1
              }
              dp(ni)(nj)(nk) += dp(i)(j)(k)
            }
          } else { // 配り元までの桁が同じでないなら、どの数字も配ってOK
            dp(ni)(nj)(nk) += dp(i)(j)(k)
          }
        }
      }
    }
    val ans = dp(n)(K)(0) + dp(n)(K)(1)
    println(ans)
  }
}
