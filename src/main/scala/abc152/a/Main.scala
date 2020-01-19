package abc152.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val m, n = sc.nextInt
    println(if (m == n) "Yes" else "No")
  }
}
