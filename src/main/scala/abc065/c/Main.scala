package abc065.c

import scala.io.StdIn._

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val input = readLine().split(" ")
    val n = input(0).toInt
    val m = input(1).toInt
    val mod = 1000000007

    if (math.abs(n - m) > 1) {
      println(0)
    } else {
      if (math.abs(n - m) == 0) {
        println(modfactrial(n, mod) * modfactrial(m, mod) % mod * 2 % mod)
      } else {
        println(modfactrial(n, mod) * modfactrial(m, mod) % mod)
      }
    }
  }

  def modfactrial(n: Int, mod: Long): Long = {
    var result = 1L
    for (i <- 1 to n) {
      result = (result * i.toLong) % mod
    }

    return result
  }
}
