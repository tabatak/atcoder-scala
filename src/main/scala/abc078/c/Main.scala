package abc078.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, m = sc.nextInt()

    val ans = math.pow(2, m) * (1900 * m + 100 * (n - m))
    println(ans.toInt)
  }
}
