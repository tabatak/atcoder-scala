package abc158.b

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, a, b = sc.nextLong()
    val ab = a + b
    val div = n / ab
    val rest = n % ab
    val ans = div * a +
      (if (rest > a) a else rest)

    println(ans)
  }
}
