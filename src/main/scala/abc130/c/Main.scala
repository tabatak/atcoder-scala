package abc130.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val w, h, x, y = sc.nextLong

    var area = w.toDouble * h / 2
    var lineNum = if (w == x * 2 && h == y * 2) 1
    else 0

    printf("%f %d\n", area, lineNum)
  }
}
