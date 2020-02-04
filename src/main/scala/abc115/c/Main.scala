package abc115.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    import scala.io.StdIn._
    val s = readLine.split(" ")
    val n = s(0).toInt
    val k = s(1).toInt
    val hs = new Array[Long](n)
    for (i <- 0 until n) {
      hs(i) = readLong
    }
    val sortedHs = hs.sorted

    var min = Long.MaxValue
    for (i <- 0 to n - k) {
      min = math.min(min, sortedHs(i + k - 1) - sortedHs(i))
    }

    println(min)

  }
}
