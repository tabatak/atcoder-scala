package abc158.e

import scala.io.StdIn.readLine

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val tmp = readLine()
    val n = tmp.split(" ")(0).toInt
    val p = tmp.split(" ")(1).toLong
    val s = readLine

    var ans = 0
    val mp = scala.collection.mutable.Set[String]()
    for (i <- 0 until n) {
      for (j <- i + 1 until n + 1) {
        val str = s.substring(i, j)
        if (mp.contains(str)) {
          ans += 1
        } else {
          val t = BigDecimal(str)
          if (t % p == 0) {
            mp.add(str)
            ans += 1
          }
        }
      }
    }
    println(ans)
  }

}
