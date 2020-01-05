package abc086.a

object Main  {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val a, b = sc.nextInt // 最初の数字を読み取る

    val result =
      if ((a * b) % 2 == 0) "Even"
      else "Odd"

    println(result)
  }
}
