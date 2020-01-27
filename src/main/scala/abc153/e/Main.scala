package abc153.e

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val h, n = sc.nextInt
    val magics = new Array[(Int, Int)](n)
    for (i <- 0 until n) {
      val a = sc.nextInt
      val b = sc.nextInt
      magics(i) = (a, b)
    }

    // モンスターの体力をi減らすため消耗する魔力の最小値
    val dp = Array.fill[Int](h + 1)(Int.MaxValue)
    dp(0) = 0
    for (magic <- magics) {
      for (i <- 0 to h) {
        if(dp(i) != Int.MaxValue){
          val nj = math.min(i + magic._1, h)
          dp(nj) = math.min(dp(nj), dp(i) + magic._2)
        }
      }
    }
    println(dp(h))
  }
}
