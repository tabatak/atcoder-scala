package abc129.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, m = sc.nextInt
    val stairs = Array.fill[Boolean](n + 1)(true)
    for (i <- 0 until m) {
      val a = sc.nextInt
      stairs(a) = false
    }

    val mod = 1000000007
    val dp = Array.fill[Int](n + 1)(0)
    dp(0) = 1
    for (i <- 0 to n) {
      for (j <- 1 to 2) {
        val next = i + j
        if (next <= n && stairs(next) == true) {
          dp(next) += dp(i)
          dp(next) = dp(next) % mod
        }
      }

    }
    println(dp(n))
  }
}
