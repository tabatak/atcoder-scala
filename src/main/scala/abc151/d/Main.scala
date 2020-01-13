package abc151.d

import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val h, w = sc.nextInt
    sc.nextLine
    val s = new Array[Array[Char]](h)
    for (i <- 0 until h) {
      s(i) = sc.nextLine.toCharArray
    }

    val INF = 1001001001
    val DI = Array(-1, 0, 1, 0)
    val DJ = Array(0, -1, 0, 1)

    var ans = 0

    for (si <- 0 until h; sj <- 0 until w) {
      // すべてのマスをスタート地点にしてチェックしていく（幅優先探索）

      if (s(si)(sj) != '#') {
        val dist = ArrayBuffer.fill[ArrayBuffer[Int]](h)(ArrayBuffer.fill[Int](w)(INF))
        dist(si)(sj) = 0
        val queue = new scala.collection.mutable.Queue[(Int, Int)]
        queue.enqueue((si, sj))

        while (!queue.isEmpty) {
          val point = queue.dequeue
          val ci = point._1
          val cj = point._2

          for (i <- 0 until 4) {
            val ni = ci + DI(i)
            val nj = cj + DJ(i)
            if (
              ((ni >= 0 && ni < h) && (nj >= 0 && nj < w)) // 枠内に収まる
                && s(ni)(nj) != '#' // 到達不可能マスではない
                && dist(ni)(nj) == INF // 未到達マスでである
            ) {
              dist(ni)(nj) = dist(ci)(cj) + 1
              queue.enqueue((ni, nj))
            }
          }
        }

        for (i <- 0 until h; j <- 0 until w) {
          if (dist(i)(j) != INF) {
            ans = math.max(ans, dist(i)(j))
          }
        }
      }
    }
    println(ans)
  }
}
