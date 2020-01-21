package abc101.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def getDivCount(x: Int, divisor: Int): Int = {
    // ここの数え方を考える
    var tmp = x
    var count = 0
    while (tmp != 0) {
      println(tmp)
      count += 1
      tmp = tmp / divisor
    }
    count
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, k = sc.nextInt
    val a = new Array[Int](n)
    for (i <- 0 until n) {
      a(i) = sc.nextInt
    }

    val minIndex = a.indexOf(1)
    println(getDivCount(minIndex, k-1) + getDivCount(n - minIndex - 1, k-1))
  }
}
