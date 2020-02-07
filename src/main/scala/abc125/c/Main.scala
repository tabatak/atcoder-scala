package abc125.c

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
