package abc112.d

object Main {
  def main(args: Array[String]): Unit = {
    solve2
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, m = sc.nextInt()
    var ans = 0
    for (a <- 1 to math.sqrt(m).toInt) {
      if (m % a == 0) {
        val b = m / a
        if (a.toLong * n <= m) ans = math.max(ans, a)
        if (b.toLong * n <= m) ans = math.max(ans, b)
      }
    }
    println(ans)
  }

  def solve2(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, m = sc.nextInt()

    def check(k: Int): Int = {
      if (m % k == 0) return k
      else check(k - 1)
    }

    // M >= K * N
    println(check(m / n))
  }

}
