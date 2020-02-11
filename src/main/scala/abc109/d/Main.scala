package abc109.d

import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val h, w = sc.nextInt
    val m = Array.fill(h, w)(0)
    for (i <- 0 until h; j <- 0 until w) {
      m(i)(j) = sc.nextInt
    }

    // 下右 だけでいいのかな。。。
    val DI = Array(1, 0)
    val DJ = Array(0, 1)

    var operations = new ArrayBuffer[String]()
    for (i <- 0 until h; j <- 0 until w) {
      val n = m(i)(j)
      if (n % 2 != 0) {
        // 奇数だったら配る
        var delivered = false
        var dIndex = 0
        while (!delivered && dIndex < 2) {
          val ni = i + DI(dIndex)
          val nj = j + DJ(dIndex)
          if (ni >= 0 && ni < h && nj >= 0 && nj < w) {
            val nn = m(ni)(nj)
            operations += s"${i + 1} ${j + 1} ${ni + 1} ${nj + 1}"

            m(i)(j) -= 1
            m(ni)(nj) += 1

            delivered = true
          }
          dIndex += 1
        }
      }
    }

    val pw = new java.io.PrintWriter(System.out)
    pw.println(operations.size)
    for (operation <- operations) {
      pw.println(operation)
    }
    pw.flush()
  }
}
