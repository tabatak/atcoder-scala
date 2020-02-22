package abc082.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val mp = scala.collection.mutable.Map[Int, Int]()
    for (i <- 0 until n) {
      val a = sc.nextInt
      if (mp.contains(a)) mp(a) += 1
      else mp.put(a, 1)
    }

    var ans = 0
    for (num <- mp.keys) {
      if (mp(num) < num) ans += mp(num)
      else if (mp(num) > num) ans += mp(num) - num
    }

    println(ans)
  }
}
