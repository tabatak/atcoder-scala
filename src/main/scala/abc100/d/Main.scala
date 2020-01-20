package abc100.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, m = sc.nextInt
    val x = new Array[Long](n)
    val y = new Array[Long](n)
    val z = new Array[Long](n)
    for (i <- 0 until n) {
      x(i) = sc.nextLong
      y(i) = sc.nextLong
      z(i) = sc.nextLong
    }

    var ans = 0L
    val sign = Array[Int](-1, 1)
    for (xs <- sign; ys <- sign; zs <- sign) {
      val sums = (0 until n).map(
        i =>
          xs * x(i) + ys * y(i) + zs * z(i)
      )

      val mx = sums.sorted.reverse.slice(0, m).sum

      ans = math.max(ans, mx)
    }

    println(ans)
  }
}
