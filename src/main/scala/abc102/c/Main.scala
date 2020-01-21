package abc102.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Long](n)
    for (i <- 0 until n) {
      a(i) = sc.nextLong
    }

    // (ai - i)を算出し、昇順に並べる
    val ab = a.zipWithIndex.map(v => v._1 - v._2 - 1).sorted
    // 中央の値が各点との距離の合計が最小になる（数直線上で負の方向にも正の方向にも動けない）
    val b = ab(n / 2)
    // 各点とbとの距離を合算=悲しさ
    val ans = ab.map(v => math.abs(v - b)).sum

    println(ans)
  }
}
