package abc083.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val x, y = sc.nextLong()

    var num = x
    var count = 0
    while (num <= y) {
      count += 1
      num = num * 2
    }

    println(count)
  }
}
