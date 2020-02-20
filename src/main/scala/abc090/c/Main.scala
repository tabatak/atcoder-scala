package abc090.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, m = sc.nextLong
    if (n == 1 || m == 1) println(math.max(1, (n - 2)) * math.max(1, (m - 2)))
    else println((n - 2) * (m - 2))
  }
}
