package abc147.b

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val s = sc.nextLine.toCharArray

    var count = 0
    for (i <- 0 until s.size / 2) {
      if (s(i) != s(s.size - i - 1)) {
        count += 1
      }
    }
    println(count)
  }
}
