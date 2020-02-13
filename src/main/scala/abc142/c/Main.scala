package abc142.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Int](n)
    for (i <- 0 until n) {
      a(i) = sc.nextInt
    }

    val aWithIndex = a.zipWithIndex.sortBy(_._1)

    val pw = new java.io.PrintWriter(System.out)
    for (i <- 0 until n) {
      pw.println(aWithIndex(i)._2 + 1)
    }
    pw.flush()
  }
}
