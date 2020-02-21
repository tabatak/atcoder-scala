package abc088.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val matrix = Array.fill[Array[Int]](3)(Array.fill[Int](3)(0))
    for (i <- 0 until 3; j <- 0 until 3) {
      matrix(i)(j) = sc.nextInt()
    }
    val a = Array.fill[Int](3)(0)
    val b = Array.fill[Int](3)(0)
    for (i <- 0 until 3) {
      b(i) = matrix(0)(i) - a(0)
    }
    for (i <- 0 until 3) {
      a(i) = matrix(i)(0) - b(0)
    }

    var ans = true
    for (i <- 0 until 3; j <- 0 until 3) {
      if (matrix(i)(j) != a(i) + b(j)) {
        ans = false
      }
    }

    if (ans) println("Yes")
    else println("No")
  }
}
