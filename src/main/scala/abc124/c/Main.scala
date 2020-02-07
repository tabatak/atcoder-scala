package abc124.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val s = sc.nextLine.toCharArray.zipWithIndex

    var count1 = 0
    var count2 = 0
    for (i <- 0 until s.size) {
      if (s(i)._2 % 2 == 0) {
        if (s(i)._1 != '0') count1 += 1
      } else {
        if (s(i)._1 != '1') count1 += 1
      }

      if (s(i)._2 % 2 == 0) {
        if (s(i)._1 != '1') count2 += 1
      } else {
        if (s(i)._1 != '0') count2 += 1
      }
    }

    println(math.min(count1, count2))
  }
}
