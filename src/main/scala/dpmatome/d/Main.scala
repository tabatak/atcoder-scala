package dpmatome.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, w = sc.nextInt
    val items = Array.fill[Array[Long]](n)(Array.fill[Long](2)(0))
    for (i <- 0 until n) {
      items(i)(0) = sc.nextLong //w
      items(i)(1) = sc.nextLong //v
    }

    val dp = Array.fill[Array[Long]](n + 1)(Array.fill[Long](100100)(0))
    for (i <- 0 until n) {
      for (sumW <- 0 to w) {
        // i番目の品物を選ぶ
        if (sumW - items(i)(0) >= 0) {
          dp(i + 1)(sumW) = math.max(dp(i + 1)(sumW), dp(i)((sumW - items(i)(0)).toInt) + items(i)(1))
        }

        // i番目の品物を選ばない
        dp(i + 1)(sumW) = math.max(dp(i + 1)(sumW), dp(i)(sumW))
      }
    }
    println(dp(n)(w))
  }
}
