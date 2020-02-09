package abc154.b

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val s = sc.nextLine
    val ans = Array.fill[Char](s.size)('x')
    println(ans.mkString(""))
  }
}
