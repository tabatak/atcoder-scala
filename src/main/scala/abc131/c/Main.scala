package abc131.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a, b, c, d = sc.nextLong

    val lcm = c * d / gcd(c, d)
    val ans =
      (b - (b / c) - (b / d) + (b / lcm)) - ((a - 1) - ((a - 1) / c) - ((a - 1) / d) + (a - 1) / lcm)

    println(ans)
  }


  def gcd(x: Long, y: Long): Long = {
    if (x == 0) y
    else gcd(y % x, x)
  }

}
