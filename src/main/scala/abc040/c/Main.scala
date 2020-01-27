package abc040.c

object Main {
  def main(args: Array[String]): Unit = {
    solveRecursive
  }

  def solveRecursive(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Int](n)
    for (i <- 0 until n) {
      a(i) = sc.nextInt
    }

    val dp = Array.fill[Long](n)(Long.MaxValue)
    dp(0) = 0

    def rec(i: Int): Long = {
      if (dp(i) < Long.MaxValue) {
        dp(i)
      } else {
        val v1 = rec(i - 1) + (a(i) - a(i - 1)).abs // i - 1 から来た場合
        val v2 = if (i > 1) rec(i - 2) + (a(i) - a(i - 2)).abs // i - 2 から来た場合
        else Long.MaxValue
        dp(i) = math.min(v1, v2)

        dp(i)
      }
    }


    println(rec(n - 1))
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Int](n)
    for (i <- 0 until n) {
      a(i) = sc.nextInt
    }

    // hiまでにかかるコスト
    val dp = Array.fill[Int](n)(Int.MaxValue)
    dp(0) = 0
    dp(1) = math.abs(a(1) - a(0))
    for (i <- 2 until n) {
      dp(i) = math.min(math.abs(a(i - 2) - a(i)) + dp(i - 2), math.abs(a(i - 1) - a(i)) + dp(i - 1))
    }
    println(dp(n - 1))
  }
}
