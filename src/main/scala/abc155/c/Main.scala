package abc155.c

import scala.io.StdIn._

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)

    val n = readInt
    val s = new Array[String](n)
    for (i <- 0 until n) {
      s(i) = readLine()
    }

    var mp = scala.collection.mutable.Map[String, Int]()
    for (i <- 0 until n) {
      if (mp.contains(s(i))) {
        mp(s(i)) += 1
      } else {
        mp.put(s(i), 1)
      }
    }
    val max = mp.values.max
    mp.filter { v => v._2 == max }.keys.toList.distinct.sorted

    val pw = new java.io.PrintWriter(System.out)
    for (str <- mp.filter { v => v._2 == max }.keys.toList.distinct.sorted) {
      pw.println(str)
    }
    pw.flush()

  }
}
