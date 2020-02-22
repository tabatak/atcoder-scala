package abc156.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)

    val n = sc.nextInt()
    val x = new Array[Int](n)
    for (i <- 0 until n) {
      x(i) = sc.nextInt()
    }
    val average = x.sum / n
    var ans = 0
    var ans2 = 0
    var ans3 = 0
    for (i <- 0 until n) {
      ans += math.pow((average - x(i)), 2).toInt
      ans2 += math.pow((average - 1 - x(i)), 2).toInt
      ans3 += math.pow((average + 1 - x(i)), 2).toInt
    }

    println(math.min(ans, math.min(ans2, ans3)))
  }
}
