package abc139.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val v = new Array[Long](n)
    for (i <- 0 until n) {
      v(i) = sc.nextLong
    }
    var count = 0
    var max = 0
    for (i <- 0 until n - 1) {
      if (v(i) >= v(i + 1)) {
        count += 1
        max = math.max(max, count)
      } else {
        count = 0
      }
    }

    println(max)
  }
}
