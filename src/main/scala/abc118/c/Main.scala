package abc118.c

object Main {
  def main(args: Array[String]): Unit = {
    solve2
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

  def solve2(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val as = new Array[Long](n)
    for (i <- 0 until n) {
      as(i) = sc.nextLong
    }

    var ans = as(0)
    for (i <- 1 until n) {
      ans = gcd(ans, as(i))
    }
    println(ans)
  }

  def gcd(x: Long, y: Long): Long = {
    if (x == 0) y
    else gcd(y % x, x)
  }

}
