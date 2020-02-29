package abc069.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val as = new Array[Long](n)
    for (i <- 0 until n) {
      as(i) = sc.nextLong
    }

    val even = as.count(v => v % 2 == 0 && v % 4 != 0)
    val mOf4 = as.count(_ % 4 == 0)

    if (even == 0 && mOf4 + 1 >= n - even - mOf4) {
      println("Yes")
    } else if (even != 0 && mOf4 >= n - even - mOf4) {
      println("Yes")
    } else {
      println("No")
    }
  }
}
