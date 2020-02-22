package abc081.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, k = sc.nextInt()
    val nums = Array.fill[Int](n + 1)(0)
    for (i <- 0 until n) {
      nums(sc.nextInt() - 1) += 1
    }

    // filterを減らしてみたら、むしろ遅くなった、、、 864ms -> 904ms
    println(nums.sorted.dropRight(k).sum)
//    println(nums.filter(_ != 0).sorted.dropRight(k).sum)
  }
}
