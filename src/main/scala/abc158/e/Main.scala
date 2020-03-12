package abc158.e

import scala.io.StdIn._

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val input = readLine().split(" ")
    val n = input(0).toInt
    val p = input(1).toInt
    val s = readLine.toCharArray

    if (10 % p == 0) {
      var ans = 0L
      for (i <- 0 until n) {
        if ((s(i) - '0') % p == 0) {
          ans += i + 1
        }
      }
      println(ans)

    } else {
      val d = new Array[Int](n + 1)
      var ten = 1
      for (i <- n - 1 to 0 by -1) {
        val a = (s(i) - '0') * ten % p
        d(i) = (d(i + 1) + a) % p
        ten = ten * 10 % p
      }

      var ans = 0L
      val count = new Array[Long](p)
      for (i <- n to 0 by -1) {
        ans += count(d(i))
        count(d(i)) += 1
      }
      println(ans)
    }
  }
}
