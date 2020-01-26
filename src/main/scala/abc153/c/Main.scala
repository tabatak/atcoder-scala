package abc153.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, k = sc.nextInt
    val a = new Array[Long](n)
    for (i <- 0 until n) {
      a(i) = sc.nextLong
    }

    val ans = a.sorted.reverse.slice(k, n).sum
    println(ans)
  }
}
