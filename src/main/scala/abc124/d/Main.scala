package abc124.d

import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, k = sc.nextInt()
    sc.nextLine()
    val s = sc.nextLine.toCharArray

    val nums = ArrayBuffer[Int]()
    var now = 1
    var cnt = 0
    for (i <- 0 until n) {
      if (s(i) == ('0' + now).toChar) {
        cnt += 1
      } else {
        nums.append(cnt)
        now = 1 - now
        cnt = 1
      }
    }
    if (cnt != 0) nums.append(cnt)

    // k=1の場合、1-0-1の1つ分の合算値をチェックしていく
    // 1-0-1-0 のように0の区間で終了していると、区間をチェックできない
    //  -> 0区間で終わる場合は、1の区間を末尾に付け足す（数値は0）
    if (nums.size % 2 == 0) nums.append(0)

    // 累積和をとる
    val sum = nums.scanLeft(0)(_ + _)

    // チェックする区間（k + 1個の1の区間 + k個の0の区間）
    val add = 2 * k + 1

    var ans = 0
    for (i <- 0 until nums.size by 2) {
      val left = i
      val right = math.min(i + add, nums.size)
      val tmp = sum(right) - sum(left)

      ans = math.max(ans, tmp)
    }

    println(ans)
  }
}
