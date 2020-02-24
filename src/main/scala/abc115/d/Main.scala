package abc115.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val x = sc.nextLong()

    val a = new Array[Long](n + 1)
    val p = new Array[Long](n + 1)
    a(0) = 1
    p(0) = 1
    for (i <- 1 until n + 1) {
      a(i) = 2 * a(i - 1) + 3
      p(i) = 2 * p(i - 1) + 1
    }

    def f(n: Int, x: Long): Long = {
      if (n == 0) {
        if (x == 0) 0L else 1L
      } else if (x == 1) {
        0L
      } else if (1 < x && x <= 1 + a(n - 1)) {
        f(n - 1, x - 1)
      } else if (x == 2 + a(n - 1)) {
        p(n - 1) + 1
      } else if (2 + a(n - 1) < x && x <= 2 + 2 * a(n - 1)) {
        p(n - 1) + 1 + f(n - 1, x - 2 - a(n - 1))
      } else {
        2 * p(n - 1) + 1
      }
    }

    println(f(n, x))

  }
}
