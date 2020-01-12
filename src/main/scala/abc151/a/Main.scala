package abc151.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    import scala.io.StdIn._
    val c = readLine()
    val str = ("abcdefghijklmnopqrstuvwxyz")

    println(str(str.indexOf(c) + 1))
  }
}
