package abc125.c

object Main {
  def main(args: Array[String]): Unit = {
    solve2
  }

  def solve2(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val as = new Array[Long](n)
    for (i <- 0 until n) {
      as(i) = sc.nextLong
    }

    val l = new Array[Long](n + 1)
    l(0) = 0
    for (i <- 0 until n) {
      l(i + 1) = gcd(l(i), as(i))
    }
    var r = new Array[Long](n + 1)
    r(n) = 0
    for (i <- n - 1 until 0 by -1) {
      r(i) = gcd(r(i + 1), as(i))
    }

    var maxGCD = -1L
    for (i <- 0 until n) {
      maxGCD = math.max(maxGCD, gcd(l(i), r(i + 1)))
    }

    println(maxGCD)
  }


  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val as = new Array[Long](n)
    for (i <- 0 until n) {
      as(i) = sc.nextLong
    }

    var skipIndex = 0
    var maxGCD = -1L
    for (i <- 0 until n) {
      var tmpGCD = -1L

      for (j <- 0 until n) {
        if (j != skipIndex) {
          if (tmpGCD == -1) {
            tmpGCD = as(j)
          }
          else {
            tmpGCD = gcd(tmpGCD, as(j))
          }
        }
      }
      maxGCD = math.max(maxGCD, tmpGCD)
      skipIndex += 1
    }

    println(maxGCD)
  }

  def gcd(x: Long, y: Long): Long = {
    if (x == 0) y
    else gcd(y % x, x)
  }

}
