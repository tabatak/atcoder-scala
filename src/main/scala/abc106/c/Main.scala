package abc106.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val s: Array[Char] = sc.nextLine.toCharArray
    val k = sc.nextLong

    val index = s.indexWhere(_ != '1')
    if (index >= 0 && index + 1 <= k) println(s(index))
    else println(1)
  }
}
