package abc148.b

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    sc.nextLine()
    val tmp = sc.nextLine()
    val s = tmp.split(" ")(0)
    val t = tmp.split(" ")(1)

    val str = new Array[Char](2 * n)
    for (i <- 0 until str.size) {
      if (i % 2 == 0) str(i) = s(i / 2)
      else str(i) = t(i / 2)
    }
    println(str.mkString(""))
  }
}
