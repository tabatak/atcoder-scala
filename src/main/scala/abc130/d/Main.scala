package abc130.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val as = new Array[Long](n)
    for (i <- 0 until n) {
      as(i) = sc.nextLong()
    }

    var ans = 0L
    var sum = 0L
    var right = 0
    for (i <- 0 until n) {
      while (sum < k && right < n) {
        // 合算値がk以上になるか、末尾に達するまで右端を進める
        sum += as(right)
        right += 1
      }

      // ここで sum < kだったらbreakしたいよなー
      // このさきいくらiを進めても絶対にk以上になることはないし
      // breakとcontinueなしでうまくかけるようになるんかなー
      if (sum >= k) {
        ans += n - right + 1
      }
      sum -= as(i)
    }

    println(ans)
  }
}
