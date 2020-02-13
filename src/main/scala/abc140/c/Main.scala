package abc140.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val b = new Array[Int](n - 1)
    for (i <- 0 until n - 1) {
      b(i) = sc.nextInt
    }

    val a = Array.fill[Int](n)(0)
    a(0) = b(0)
    for (i <- 1 until n) {
      if (i == n - 1) {
        a(i) = b(i - 1)
      } else {
        a(i) = math.min(b(i - 1), b(i))
      }
    }
    println(a.sum)
  }
}
