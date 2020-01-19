package abc152.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    sc.nextLine
    val p = new Array[Int](n)
    for (i <- 0 until n) {
      p(i) = sc.nextInt
    }

    var count = 1
    var maxNum = p(0)
    var minNum = p(0)
    for (i <- 1 until n) {
      if (p(i) <= maxNum && p(i) <= minNum) count += 1

      maxNum = math.max(p(i), maxNum)
      minNum = math.min(p(i), minNum)
    }
    println(count)
  }
}
