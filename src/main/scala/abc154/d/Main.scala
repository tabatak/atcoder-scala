package abc154.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, k = sc.nextInt
    val p = new Array[Int](n)
    val acc = new Array[Double](n + 1)
    acc(0) = 0
    for (i <- 0 until n) {
      p(i) = sc.nextInt

      acc(i + 1) = acc(i) + (1 to p(i)).sum.toDouble / p(i)
    }

    var index = 0
    var max = 0d
    for (i <- 0 to n - k) {
      val sum = acc(i + k) - acc(i)
      if (sum >= max) {
        max = sum
        index = i
      }
    }

    var ans = 0d
    for (i <- index to index + k - 1) {
      ans += (1 to p(i)).sum.toDouble / p(i)
    }

    //7.000000000000
    printf("%.12f\n", max)
  }
}
