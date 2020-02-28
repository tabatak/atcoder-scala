package abc148.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a, b = sc.nextInt
    println(
      if (a == 1 && b == 2) 3
      else if (a == 1 && b == 3) 2
      else if (a == 2 && b == 1) 3
      else if (a == 2 && b == 3) 1
      else if (a == 3 && b == 1) 2
      else 1
    )
  }
}
