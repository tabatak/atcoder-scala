package abc105.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val m = sc.nextLong
    val a = new Array[Long](n)
    for (i <- 0 until n) {
      a(i) = sc.nextLong
    }

    // 累積和のmodを計算
    val sum = new Array[Long](n + 1)
    for (i <- 0 until n) {
      sum(i + 1) = (sum(i) + a(i)) % m
    }

    // mで割った余りが等しくなる累積和の組はその差分（その間の値の合算値）がmの倍数（mで割り切れる）
    val mp = scala.collection.mutable.Map[Long, Long]()
    var ans = 0L
    for (i <- sum) {
      ans = ans + mp.get(i).getOrElse(0L)
      if (mp.contains(i)) mp(i) = mp(i) + 1L
      else mp.put(i, 1)
    }

    println(ans)
  }
}
