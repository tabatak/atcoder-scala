package dpmatome.b

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, k = sc.nextInt
    val h = new Array[Int](n)
    for (i <- 0 until n) {
      h(i) = sc.nextInt
    }

    // hiまでにかかるコスト
    val dp = Array.fill[Int](n)(Int.MaxValue)
    dp(0) = 0
    for (i <- 0 until n) {
      for (j <- 1 to k) {
        if (i + j < n) {
          dp(i + j) = math.min(dp(i + j), dp(i) + (h(i) - h(i + j)).abs)
        }
      }
    }
    println(dp(n - 1))
  }
}
