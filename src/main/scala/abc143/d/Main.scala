package abc143.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val l = new Array[Int](n)
    for (i <- 0 until n) {
      l(i) = sc.nextInt
    }
    val sortedL = l.sorted

    var count = 0
    for (i <- 0 until n - 2; j <- i + 1 until n - 1) {
      val a = sortedL(i)
      val b = sortedL(j)

      var flg = true
      var k = n - 1
      while (flg && k >= j + 1) {
        val c = sortedL(k)
        if (c < a + b) {
          flg = false
        } else {
          k -= 1
        }
      }
      count += k - j
    }
    println(count)
  }
}
