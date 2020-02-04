package abc116.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    import scala.io.StdIn._
    val n = readInt()
    val hs = readLine.split(" ").map(_.toInt)

    var ans = 0
    var active = 0
    for (i <- 0 until n) {
      if (active >= hs(i)) {
        active = hs(i)
      } else {
        ans += hs(i) - active
        active = hs(i)
      }
    }

    println(ans)
  }
}
