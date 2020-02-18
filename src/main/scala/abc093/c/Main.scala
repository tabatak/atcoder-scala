package abc093.c

import scala.math.max

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a, b, c = sc.nextInt

    val mx = max(max(a, b), c)
    val m = if (3 * mx % 2 == (a + b + c) % 2) {
      mx
    } else {
      mx + 1
    }

    val ans = ((3 * m) - (a + b + c)) / 2
    println(ans)
  }
}
