package abc134.c

object Main {
  def main(args: Array[String]): Unit = {
    solve2
  }

  def solve2(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Int](n)
    for (i <- 0 until n) {
      a(i) = sc.nextInt
    }

    //ryota さんのコードを見てなるほどなと
    val sorted = a.sorted
    val max = sorted(n - 1)
    val secondMax = sorted(n - 2)
    val pw = new java.io.PrintWriter(System.out)
    for (i <- 0 until n) {
      if (a(i) == max) pw.println(secondMax)
      else pw.println(max)
    }
    pw.flush()
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
    val pw = new java.io.PrintWriter(System.out)
    for (i <- 0 until n) {
      if (a(i) == first) {
        if (multiMaxFlg) {
          pw.println(first)
        } else {
          pw.println(second)
        }
      } else {
        pw.println(first)
      }
    }
    pw.flush()
  }
}
