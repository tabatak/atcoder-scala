package abc114.c

import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    import scala.io.StdIn._
    val n = readLong

    val nums = new ArrayBuffer[String]()

    def dfs(x: String): Unit = {
      if (!x.isEmpty && x.toLong > n) {
        // n を超えた数は以降の処理は対象外
        return
      }

      if (x.toCharArray.distinct.size == 4) {
        // 3, 5, 7 を少なくとも一つ含む場合は753数（頭の0があるので+1）
        nums += x
      }
      // 3, 5, 7を後ろにくっつけて再帰
      dfs(x + "3")
      dfs(x + "5")
      dfs(x + "7")
    }

    dfs("0")
    println(nums.size)
  }
}
