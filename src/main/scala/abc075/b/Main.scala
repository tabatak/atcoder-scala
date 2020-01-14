package abc075.b

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

    val result = ArrayBuffer.fill[ArrayBuffer[Int]](h)(ArrayBuffer.fill[Int](w)(0))

    val SHP = 1001001001
    val DI = Array(-1, -1, 0, 1, 1, 1, 0, -1)
    val DJ = Array(0, -1, -1, -1, 0, 1, 1, 1)

    for (si <- 0 until h; sj <- 0 until w) {
      // すべてのマスをチェックしていく
      if (s(si)(sj) == '#') {
        result(si)(sj) = SHP
      } else {
        for (i <- 0 until 8) {
          val ni = si + DI(i)
          val nj = sj + DJ(i)
          if (
            ((ni >= 0 && ni < h) && (nj >= 0 && nj < w)) // 枠内に収まる
              && s(ni)(nj) == '#' // 到達不可能マス
          ) {
            result(si)(sj) += 1
          }
        }
      }
    }
    result.foreach(raw => println(raw.map(v => if (v == SHP) "#" else v.toString).mkString))
  }
}
