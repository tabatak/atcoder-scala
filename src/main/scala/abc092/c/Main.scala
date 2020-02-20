package abc092.c

object Main {
  def main(args: Array[String]): Unit = {
    solve2
  }

  def solve2(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Int](n + 2) // 両端は0にする
    for (i <- 1 until n + 1) {
      a(i) = sc.nextInt()
    }

    var cost = 0
    for (i <- 1 until n + 2) {
      cost += math.abs(a(i) - a(i - 1))
    }
    val pw = new java.io.PrintWriter(System.out)
    for (i <- 1 until n + 1) {
      val tmp = cost - math.abs(a(i - 1) - a(i)) - math.abs(a(i) - a(i + 1)) + math.abs(a(i - 1) - a(i + 1))
      pw.println(tmp)
    }
    pw.flush()
  }


  // 以下は最初に出したややこしすぎるやり方。。
  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    var a = new Array[Int](n + 2)
    a(0) = 0
    a(n + 1) = 0
    for (i <- 1 until n + 1) {
      a(i) = sc.nextInt()
    }
    val accL = new Array[Int](n + 2)
    for (i <- 1 until n + 2) {
      accL(i) = accL(i - 1) + math.abs(a(i) - a(i - 1))
    }
    var accR = new Array[Int](n + 2)
    val reverseA = a.reverse
    for (i <- 1 until n + 2) {
      accR(i) = accR(i - 1) + math.abs(reverseA(i) - reverseA(i - 1))
    }
    accR = accR.reverse

    //indexやら、reverseやら全然整理がつかん。。
    val pw = new java.io.PrintWriter(System.out)
    for (i <- 1 until n + 1) {
      val cost = accL(i - 1) + math.abs(a(i - 1) - a(i + 1)) + accR(i + 1)
      pw.println(cost)

    }
    pw.flush()
  }


}
