package abc154.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val st = sc.nextLine().split(" ")
    val a, b = sc.nextInt
    sc.nextLine()
    val u = sc.nextLine()

    if (u == st(0)) println((a - 1) + " " + b)
    else println(a + " " + (b - 1))
  }
}
