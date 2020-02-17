package abc146.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a, b, x = sc.nextLong
    val maxNum = 1000000000L

    def binarySearch(l: Long, r: Long): Long = {
      val mid = (l + r) / 2

      if (checkCost(mid)) {
        // 中間値がコスト内で購入できる場合、より大きな整数を試す
        if (mid + 1 == r) return mid
        binarySearch(mid, r)
      } else {
        // 中間値がコスト内で購入できない場合、より小さな整数を試す
        binarySearch(l, mid)
      }
    }

    def checkCost(n: Long): Boolean = {
      if (n == 0) true
      else a * n + b * n.toString.length <= x
    }

    if (checkCost(maxNum)) {
      println(maxNum)
    } else {
      println(binarySearch(0, maxNum))
    }
  }
}
