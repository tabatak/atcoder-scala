package abc055.b

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt

  val mod: Long = 1000000007L
  val result = (1 to n).foldLeft(1L)((z, v) => z * v % mod)
  println(result)
}
