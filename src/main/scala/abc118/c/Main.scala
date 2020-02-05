package abc118.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val as = new Array[Long](n)
    for (i <- 0 until n) {
      as(i) = sc.nextLong
    }

    var isFinished = false
    while (!isFinished) {
      val min = as.filter(_ != 0).min
      val minIndex = as.indexOf(min)
      for (i <- 0 until n) {
        if (i != minIndex) {
          as(i) = as(i) % min
        }
      }

      if (as.count(_ != 0) == 1) {
        isFinished = true
      }
    }
    println(as.find(_ != 0).get)
  }
}
