package abc066.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Long](n)
    for (i <- 0 until n) {
      a(i) = sc.nextLong()
    }
    val reversed = a.reverse

    val ans = Array.fill[Long](n)(0L)
    var step = 0
    for (i <- 0 until n) {
      if (i % 2 == 0) {
        ans(step) = reversed(i)
      } else {
        ans(n - 1 - step) = reversed(i)

        step += 1
      }
    }

    println(ans.mkString(" "))
  }
}
