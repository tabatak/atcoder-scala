package abc099.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val patterns = Seq(1, 6, 36, 216, 1296, 7776, 46656, 9, 81, 729, 6561, 59049).sorted

    val dp = Array.fill[Int](n + 1)(Int.MaxValue)
    dp(0) = 0
    for (i <- 0 to n) {
      for (pat <- patterns) {
        if (i + pat <= n) {
          dp(i + pat) = math.min(dp(i + pat), dp(i) + 1)
        }
      }
    }
    println(dp(n))
  }
}
