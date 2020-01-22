package abc103.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Long](n)
    for (i <- 0 until n) {
      a(i) = sc.nextLong
    }

    val ans: Long = a.map(_ - 1).sum
    println(ans)
  }
}
