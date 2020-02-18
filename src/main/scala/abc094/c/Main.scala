package abc094.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val x = new Array[Long](n)
    for (i <- 0 until n) {
      x(i) = sc.nextLong()
    }
    val sortedX = x.sorted
    val medLeft = sortedX(n / 2 - 1)
    val medRight = sortedX(n / 2)
    val pw = new java.io.PrintWriter(System.out)
    for (i <- 0 until n) {
      if (x(i) < medRight) {
        pw.println(medRight)
      } else {
        pw.println(medLeft)
      }
    }
    pw.flush()
  }
}
