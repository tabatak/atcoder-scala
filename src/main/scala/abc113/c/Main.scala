package abc113.c

import scala.util.Sorting

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    import scala.io.StdIn._
    val s = readLine().split(" ")
    val n = s(0).toInt
    val m = s(1).toInt
    val items = new Array[(Int, Int, Int)](m)
    for (i <- 0 until m) {
      val line = readLine().split(" ")
      items(i) = (i, line(0).toInt, line(1).toInt)
    }

    Sorting.quickSort(items)(Ordering.by(_._3))
    val cityCount = new Array[Int](n)
    val cityNumbers = new Array[String](m)
    for (item <- items) {
      val i = item._1
      val p = item._2 - 1
      val num = cityCount(p) + 1
      cityNumbers(i) = "%06d%06d".format(p + 1, num)

      cityCount(p) += 1
    }

    val out = new java.io.PrintWriter(System.out)

    cityNumbers.foreach(out.println)
    out.flush()
  }

}
