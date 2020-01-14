package abc096.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val h, w = sc.nextInt
    sc.nextLine
    val s = new Array[Array[Char]](h)
    for (i <- 0 until h) {
      s(i) = sc.nextLine.toCharArray
    }

    // 上下左右
    val DI = Array(-1, 0, 1, 0)
    val DJ = Array(0, -1, 0, 1)

    var ans = true
    for (si <- 0 until h; sj <- 0 until w) {
      if (s(si)(sj) == '#') {
        // 自身が#ならば、周囲に#があるかをチェック
        var count = 0
        for (i <- 0 until 4) {
          val ni = si + DI(i)
          val nj = sj + DJ(i)
          if (
            ((ni >= 0 && ni < h) && (nj >= 0 && nj < w)) // 枠内に収まる
              && s(ni)(nj) == '#' // 到達不可能マス
          ) {
            count += 1
          }
        }
        if (count == 0) ans = false
      }
    }
    println(if (ans) "Yes" else "No")
  }
}
