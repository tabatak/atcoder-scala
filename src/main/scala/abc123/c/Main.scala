package abc123.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextLong
    val abcde = new Array[Long](5)
    for (i <- 0 until 5) {
      abcde(i) = sc.nextLong
    }
    println((n-1) / abcde.min + 5)
//    if (n <= abcde.min) println(5)
//    else {
//      if (n % abcde.min == 0) println(5L + n / abcde.min - 1)
//      else println(5L + n / abcde.min)
//    }
  }
}
