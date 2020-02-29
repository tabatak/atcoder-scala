package abc070.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val ts = new Array[Long](n)
    for (i <- 0 until n) {
      ts(i) = sc.nextLong
    }

    var ans = ts(0)
    for (i <- 1 until n) {
      ans = lcm(ans, ts(i))
    }

    println(ans)
  }

  def lcm(x: Long, y: Long): Long = {
    x / gcd(x, y) * y
  }

  def gcd(x: Long, y: Long): Long = {
    if (x == 0) y
    else gcd(y % x, x)
  }

}
