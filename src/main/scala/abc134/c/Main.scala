package abc134.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }


  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Int](n)
    for (i <- 0 until n) {
      a(i) = sc.nextInt
    }

    //感想
    //何回もコレクション内を巡回しすぎ。。。
    val first = a.max
    val second = if (a.count(_ != first) == 0) first else a.filter(_ != first).max
    val multiMaxFlg = a.count(_ == first) > 1
    for (i <- 0 until n) {
      if (a(i) == first) {
        if (multiMaxFlg) {
          println(first)
        } else {
          println(second)
        }
      } else {
        println(first)
      }
    }
  }
}
