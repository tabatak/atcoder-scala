package abc151.a

object Main {
  def main(args: Array[String]): Unit = {
    solve2
  }

  def solve(): Unit = {
    import scala.io.StdIn._
    val c = readLine()
    val str = ("abcdefghijklmnopqrstuvwxyz")

    println(str(str.indexOf(c) + 1))
  }

  def solve2(): Unit = {
    import scala.io.StdIn._
    var c = readChar.toInt
    c = c + 1
    println(c.toChar)
  }
}
