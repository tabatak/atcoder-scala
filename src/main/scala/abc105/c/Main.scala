package abc105.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    var n = sc.nextLong

    var ans = ""
    while (n != 0) {
      if (n % 2 != 0) {
        n -= 1
        ans = "1" + ans
      } else {
        ans = "0" + ans
      }
      n = n / -2
    }

    if (ans == "") ans = "0"
    println(ans)
  }

  def solve2(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextLong

    val limit = 30 //仮に100桁
    for (mask <- 0 until (1 << limit)) {
      var num = 0L
      for (i <- 0 until limit) {
        if (((mask >> i) & 1) == 1) {
          num += math.pow(-2, i).longValue
        }
      }
      if (num == n) {
        println(mask.toBinaryString)
        return
      }
    }
  }
}
