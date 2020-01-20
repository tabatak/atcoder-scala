package abc100.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def getDivCount(x: Int): Int = {
    var tmp = x
    var count = 0
    while (tmp % 2 == 0) {
      count += 1
      tmp = tmp / 2
    }
    count
  }


  def getDivCount2(x: Int, c: Int = 0): Int = {
    if (x % 2 != 0) c
    else getDivCount2(x / 2) + 1
  }

  @scala.annotation.tailrec
  def getDivCount3(x: Int, c: Int = 0): Int = {
    if (x % 2 != 0) c
    else getDivCount3(x / 2, c + 1)
  }


  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Int](n)
    for (i <- 0 until n) {
      a(i) = sc.nextInt
    }

    val loopCount =
      a.map(v =>
        if (v % 2 == 0) getDivCount3(v)
        else 0
      ).sum
    println(loopCount)
  }
}
