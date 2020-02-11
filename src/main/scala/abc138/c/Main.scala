package abc138.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val v = new Array[Int](n)
    for (i <- 0 until n) {
      v(i) = sc.nextInt
    }
    val sortedV = v.sorted
    var tmp = sortedV(0).toDouble
    for (i <- 1 until n) {
      tmp = (tmp + sortedV(i)) / 2
    }

    println(tmp)
  }
}
