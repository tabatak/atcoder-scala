package abc092.c

object Main extends App {
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
