package hitachi20200308.a

import scala.io.StdIn.readLine

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val s = readLine()

    if (s.length % 2 != 0) {
      println("No")
    } else {

      var ans = true
      for (i <- 0 until s.length) {
        if (i % 2 == 0 && s(i) != 'h') ans = false
        if (i % 2 != 0 && s(i) != 'i') ans = false
      }
      println(if (ans) "Yes" else "No")
    }
  }
}
