package abc156.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)

    val n, a, b = sc.nextInt()
    val MOD = 1000000007L

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


    val total = modpow(2L, n.toLong, MOD) - 1
    val combA = modcomb(n, a, MOD)
    val combB = modcomb(n, b, MOD)
    val ans = (total - combA - combB) % MOD

    if(ans >= 0) println(ans)
    else println(ans + MOD)

  }

}
