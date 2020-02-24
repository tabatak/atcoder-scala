package abc112.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
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
}