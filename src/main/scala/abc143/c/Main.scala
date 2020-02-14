package abc143.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    sc.nextLine
    val s = sc.nextLine.toCharArray

    //    var count = 0
    //    var currentChar = '@'
    //    for (i <- 0 until n) {
    //      if (s(i) != currentChar) {
    //        currentChar = s(i)
    //        count += 1
    //      }
    //    }
    //currentなんてもたなくていいのか！
    var count = 1
    for (i <- 0 until n - 1) {
      if (s(i) != s(i + 1)) {
        count += 1
      }
    }
    println(count)
  }
}
