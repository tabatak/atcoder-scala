package abc048.b

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, x = sc.nextLong
  val result = calc(b, x) - calc(a - 1, x)
  println(result)

  def calc(v: Long, x: Long): Long = {
    if (v < 0) 0 else v / x + 1
  }
}
