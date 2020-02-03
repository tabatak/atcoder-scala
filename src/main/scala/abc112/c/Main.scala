package abc112.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  // 処理の方法はわかるけれど、全然整理できたコードにならない。。
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
          result = (x, y, ret._2)
        }

      }
    }

    println(result._1 + " " + result._2 + " " + result._3)
  }

  private def check(x: Int, y: Int, n: Int, xs: Array[Long], ys: Array[Long], hs: Array[Long]): (Boolean, Long) = {
    var height = -1L
    var flg = false
    var index = 0
    while (!flg && index < n) {
      if (height == -1 && hs(index) != 0) {
        //高さを確定してみる！
        height = (x - xs(index)).abs + (y - ys(index)).abs
        println("height = " + height)
      } else {
        val tmpHeight = math.min(height - (((x - xs(index)).abs + (y - ys(index)).abs)), 0)
        if (tmpHeight != hs(index)) {
          flg = false
        }
      }
      index += 1
    }

    (flg, height)
  }

}
