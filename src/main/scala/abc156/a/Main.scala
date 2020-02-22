package abc156.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)

    val n, r = sc.nextInt()


    if (n >= 10) println(r)
    else {
      println(r + 100 * (10 - n))
    }


  }
}
