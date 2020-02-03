package abc112.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val xs = new Array[Long](n)
    val ys = new Array[Long](n)
    val hs = new Array[Long](n)
    for (i <- 0 until n) {
      xs(i) = sc.nextLong
      ys(i) = sc.nextLong
      hs(i) = sc.nextLong
    }

    var result = (0, 0, 0L)
    for (x <- 0 to 100) {
      for (y <- 0 to 100) {
        val ret = check(x, y, n, xs, ys, hs)
        if (ret._1) {
          println(x + " " + y + " " + ret._2)
          return
        }
      }
    }

  }

  private def check(x: Int, y: Int, n: Int, xs: Array[Long], ys: Array[Long], hs: Array[Long]): (Boolean, Long) = {
    var index = 0
    val notZeroIndex: Int = hs.indexWhere(h => h != 0L)
    val H = hs(notZeroIndex) + ((x - xs(notZeroIndex)).abs + (y - ys(notZeroIndex)).abs)
    while (index < n) {
      val tmpHeight = math.max((H - (((x - xs(index)).abs + (y - ys(index)).abs))), 0) // ここの条件読み間違えてたかも。。
      if (tmpHeight != hs(index)) {
        return (false, -1)
      }
      index += 1
    }

    (true, H)
  }

}