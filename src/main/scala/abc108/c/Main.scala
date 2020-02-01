package abc108.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, k = sc.nextInt

    if (k % 2 != 0) {
      // kが奇数の場合
      val ans = math.pow((1 to n).count(_ % k == 0), 3).toLong
      println(ans)

    } else {
      // kが偶数の場合
      val ans = math.pow((1 to n).count(_ % k == 0), 3).toLong + math.pow((1 to n).count(_ % k == (k / 2)), 3).toLong
      println(ans)
    }
  }
}
