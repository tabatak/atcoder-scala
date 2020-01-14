package abc070.b

import scala.math.{abs, max, min}

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a, b, c, d = sc.nextInt

    if (b < c || d < a) {
      println(0)
    } else {
      println(abs(max(a, c) - min(b, d)))
    }
  }
}
