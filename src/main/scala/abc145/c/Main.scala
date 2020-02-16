package abc145.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val x = new Array[Int](n)
    val y = new Array[Int](n)
    for (i <- 0 until n) {
      x(i) = sc.nextInt
      y(i) = sc.nextInt
    }

    val perm: Iterator[IndexedSeq[Int]] = (0 until n).permutations
    var sum = 0d
    var counter = 0
    perm.foreach { list =>
      var tmpSum = 0d
      for (i <- 0 until n - 1) {
        val tmp = math.sqrt(
          math.pow(x(list(i + 1)) - x(list(i)), 2) + math.pow(y(list(i + 1)) - y(list(i)), 2)
        )
        tmpSum += tmp
      }
      sum += tmpSum
      counter += 1
    }

    printf("%.9f\n", sum / counter)
  }
}
