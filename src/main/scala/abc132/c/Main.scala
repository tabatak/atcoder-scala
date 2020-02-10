package abc132.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val d = new Array[Int](n)
    for (i <- 0 until n) {
      d(i) = sc.nextInt
    }

    val sorted = d.sorted
    println(sorted(n / 2) - sorted(n / 2 - 1))
  }
}
