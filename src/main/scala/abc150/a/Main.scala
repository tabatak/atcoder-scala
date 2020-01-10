package abc150.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, x = sc.nextInt

    val result =
      if (500 * n >= x) {
        "Yes"
      } else {
        "No"
      }

    println(result)
  }
}
