package abc147.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a, b, c = sc.nextLong

    if (a + b + c >= 22) println("bust")
    else println("win")
  }
}
