package dpmatome.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val abcs = Array.fill[Array[Int]](n)(Array.fill[Int](3)(0))
    for (i <- 0 until n) {
      abcs(i)(0) = sc.nextInt //a
      abcs(i)(1) = sc.nextInt //b
      abcs(i)(2) = sc.nextInt //c
    }

    val dp = Array.fill[Array[Int]](n + 1)(Array.fill[Int](3)(0))
    for (i <- 0 until n) {
      for (j <- 0 until 3) {
        for(k <- 0 until 3) {
          if(j != k) {
            dp(i + 1)(k) = math.max(dp(i + 1)(k), dp(i)(j) + abcs(i)(k))
          }
        }
      }
    }
    println(dp(n).toList.max)
  }
}
