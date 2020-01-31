package abc107.c

object Main {
  def main(args: Array[String]): Unit = {
    solve2
  }

  // がちゃがちゃしてるけどこっちは通った！
  // 考え方はほぼ同じで、距離の計算といちいちsliceしてるとこがまずかったかー
  def solve2(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, k = sc.nextInt
    val a = new Array[Long](n)
    for (i <- 0 until n) {
      a(i) = sc.nextLong
    }

    // 左からk個ずつとってみて、最小を求めてみる
    var ans = Long.MaxValue
    for (i <- 0 to n - k) {
      val x = a(i)
      val y = a(i + k - 1)

      val dist = math.abs(y - x)
      ans = math.min(ans, math.min((math.abs(x) + dist), (math.abs(y) + dist)))

    }
    println(ans)
  }


  // これだとTLE!!!!!
  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, k = sc.nextInt
    val a = new Array[Long](n)
    for (i <- 0 until n) {
      a(i) = sc.nextLong
    }

    // 左からk個ずつとってみて、最小を求めてみる
    var ans = Long.MaxValue
    for (i <- 0 to n - k) {
      val part = a.slice(i, i + k)
      val min = part.min
      val max = part.max
      val (greater, lesser) = if (min.abs >= max.abs) (min.abs, max.abs) else (max.abs, min.abs)

      if ((min < 0 && max < 0) || (min > 0 && max > 0)) {
        ans = math.min(ans, greater)
      } else {
        ans = math.min(ans, greater + 2 * lesser)
      }
    }
    println(ans)
  }
}
