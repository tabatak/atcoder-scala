package abc153.b

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val h, n = sc.nextInt
    val a = new Array[Int](n)
    for (i <- 0 until n) {
      a(i) = sc.nextInt
    }

    if (h <= a.sum) println("Yes")
    else println("No")
  }
}
