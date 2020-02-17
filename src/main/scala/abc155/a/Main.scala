package abc155.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a, b, c = sc.nextInt
    if ((a == b && b == c) || (a != b && b != c && c != a)) println("No")
    else println("Yes")
  }
}
