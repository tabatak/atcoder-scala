package abc152.b

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a, b = sc.nextInt
    if (a <= b) {
      println(Seq.fill(b)(a).mkString(""))
    } else {
      println(Seq.fill(a)(b).mkString(""))
    }
  }
}
