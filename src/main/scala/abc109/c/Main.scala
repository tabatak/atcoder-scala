package abc109.c

object Main {
  def main(args: Array[String]): Unit = {
    solve2
  }

  def solve2(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val x = sc.nextLong
    val a = new Array[Long](n)
    for (i <- 0 until n) {
      a(i) = (sc.nextLong - x).abs
    }

    var divisor = a(0)
    for (i <- 1 until n) {
      divisor = gcd(a(i), divisor)
    }
    println(divisor)
  }


  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val x = sc.nextLong
    val a = new Array[Long](n)
    for (i <- 0 until n) {
      a(i) = sc.nextLong
    }

    val abss = a.map(v => (v - x).abs).sorted
    var divisor = abss.min
    for (i <- 1 until n) {
      if (abss(i) % divisor != 0) {
        divisor = gcd(abss(i), divisor)
      }
    }
    println(divisor)
  }

  def gcd(x: Long, y: Long): Long = {
    if (x == 0) y
    else gcd(y % x, x)
  }

}
