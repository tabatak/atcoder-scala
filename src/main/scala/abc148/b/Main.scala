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

    var str = ""
    for (i <- 0 until n) {
      str += s(i)
      str += t(i)
    }
    println(str.mkString(""))
  }
}
