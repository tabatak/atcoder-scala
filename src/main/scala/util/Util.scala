package util

object Util {
  // 上下左右
  val DI = Array(-1, 0, 1, 0)
  val DJ = Array(0, -1, 0, 1)


  def gcd(x: Long, y: Long): Long = {
    if (x == 0) y
    else gcd(y % x, x)
  }

  // https://qiita.com/drken/items/3b4fdf0a78e7a138cd9a#4-%E7%B4%AF%E4%B9%97-an
  def modpow(a: Long, n: Long, mod: Long): Long = {
    var res = 1L
    var aTmp = a
    var nTmp = n
    while (nTmp > 0) {
      if (nTmp % 2 != 0) {
        res = res * aTmp % mod
      }
      aTmp = aTmp * aTmp % mod
      nTmp = nTmp / 2
    }

    res
  }

  def modcomb(n: Long, a: Int, mod: Long): Long = {
    var x = 1L
    var y = 1L
    for (i <- 0 until a) {
      x = x * (n - i)
      x %= mod
      y = y * (i + 1)
      y %= mod
    }
    x * modpow(y, mod - 2, mod) % mod
  }


  //  val pw = new java.io.PrintWriter(System.out)
//  pw.println(operations.size)
//  for (operation <- operations) {
//    pw.println(operation)
//  }
//  pw.flush()

}
