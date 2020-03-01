package abc157.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, m = sc.nextInt()
    val ss = new Array[Int](m)
    val cs = new Array[Int](m)
    val num = Array.fill[Int](n)(-1)
    var flg = true
    for (i <- 0 until m) {
      ss(i) = sc.nextInt()
      cs(i) = sc.nextInt()

    }

    for (i <- 0 until m) {
      if (num(ss(i) - 1) == -1) {
        num(ss(i) - 1) = cs(i)
      } else if (num(ss(i) - 1) != cs(i)) {
        flg = false
      }
    }

    if (!flg) {
      println(-1)
      return
    } else if (n > 1 && num(0) == 0) {
      println(-1)
      return
    }

    // これはひどい。。
    if (n == 1 && m == 0) {
      num(0) = 0
    }

    if (num(0) == -1) {
      num(0) = 1
    }
    for (i <- 1 until n) {
      if (num(i) == -1) {
        num(i) = 0
      }
    }

    println(num.mkString(""))
  }
}
