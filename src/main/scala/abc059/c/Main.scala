package abc059.c

object Main {
  def main(args: Array[String]): Unit = {
    solve2
  }
  def solve2(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Int](n)
    for(i <- 0 until n){
      a(i) = sc.nextInt
    }

    var sum = 0L
    var opeCount1 = 0L
    // 正、負、正、負（偶数インデックスが正）とする
    for (i <- 0 until n) {
      sum = sum + a(i)

      if (i % 2 == 0) {
        if (sum <= 0) {
          opeCount1 += -sum + 1
          sum = 1
        }
      } else {
        if (sum >= 0) {
          opeCount1 += sum + 1
          sum = -1
        }
      }
    }

    sum = 0L
    var opeCount2 = 0L
    // 負、正、負、正（奇数インデックスが正）とする
    for (i <- 0 until n) {
      sum = sum + a(i)

      if (i % 2 != 0) {
        if (sum <= 0) {
          opeCount2 += -sum + 1
          sum = 1
        }
      } else {
        if (sum >= 0) {
          opeCount2 += sum + 1
          sum = -1
        }
      }
    }

    println(math.min(opeCount1, opeCount2))
  }


  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Int](n)
    for(i <- 0 until n){
      a(i) = sc.nextInt
    }

    var prevSum = a(0)
    var opeCount = 0

    for (i <- 1 until n) {
      val currSum = prevSum + a(i)

      if (prevSum < 0 && currSum < 0) {
        opeCount += math.abs(currSum) + 1
        prevSum = 1
      } else if (prevSum > 0 && currSum > 0) {
        opeCount += math.abs(currSum) + 1
        prevSum = -1
      } else {
        if (currSum == 0) {
          opeCount += 1
          if (prevSum < 0) {
            prevSum = 1
          } else {
            prevSum = -1
          }
        } else {
          prevSum = prevSum + a(i)
        }
      }
    }

    println(opeCount)
  }

}
