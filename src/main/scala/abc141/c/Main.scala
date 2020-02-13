package abc141.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val k = sc.nextLong
    val q = sc.nextInt
    val wincounts = new Array[Int](n)
    for (i <- 0 until q) {
      val win = sc.nextInt - 1
      wincounts(win) += 1
    }

    val pw = new java.io.PrintWriter(System.out)
    for (i <- 0 until n) {
      pw.println(if (k - q + wincounts(i) > 0) "Yes" else "No")
    }
    pw.flush()
  }
}
