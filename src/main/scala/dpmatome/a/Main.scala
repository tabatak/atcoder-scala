package dpmatome.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val h = new Array[Int](n)
    for (i <- 0 until n) {
      h(i) = sc.nextInt
    }

    // hiまでにかかるコスト
    val dp = Array.fill[Int](n)(Int.MaxValue)
    dp(0) = 0
    dp(1) = math.abs(h(1) - h(0))
    for (i <- 2 until n) {
      dp(i) = math.min(math.abs(h(i - 2) - h(i)) + dp(i - 2), math.abs(h(i - 1) - h(i)) + dp(i - 1))
    }
    println(dp(n - 1))
  }
}
