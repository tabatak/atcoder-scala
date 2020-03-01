package abc157.b

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val bingo = Array.fill[Array[Int]](3)(Array.fill[Int](3)(0))
    for (i <- 0 until 3; j <- 0 until 3) {
      bingo(i)(j) = sc.nextInt()
    }
    val n = sc.nextInt()
    val bs = new Array[Int](n)
    for (num <- 0 until n) {
      bs(num) = sc.nextInt()

      for (i <- 0 until 3; j <- 0 until 3) {
        if (bingo(i)(j) == bs(num)) {
          // 埋まったマス
          bingo(i)(j) = -1
        }
      }
    }


    var ans = false
    for (i <- 0 until 3) {
      if (bingo(i)(0) == -1 && bingo(i)(1) == -1 && bingo(i)(2) == -1) {
        ans = true
      }

      if (bingo(0)(i) == -1 && bingo(1)(i) == -1 && bingo(2)(i) == -1) {
        ans = true
      }
    }

    if (bingo(0)(0) == -1 && bingo(1)(1) == -1 && bingo(2)(2) == -1) {
      ans = true
    }
    if (bingo(2)(0) == -1 && bingo(1)(1) == -1 && bingo(0)(2) == -1) {
      ans = true
    }

    println(if (ans) "Yes" else "No")
  }
}
