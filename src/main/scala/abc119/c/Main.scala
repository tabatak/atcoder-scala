package abc119.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, a, b, c = sc.nextInt
    val ls = new Array[Int](n)
    for (i <- 0 until n) {
      ls(i) = sc.nextInt
    }

    var minMP = Int.MaxValue

    def dfs(depth: Int, candidate: Array[Int]): Unit = {
      if (depth == n) {
        val countA = candidate.count(_ == 0)
        val countB = candidate.count(_ == 1)
        val countC = candidate.count(_ == 2)

        if (countA == 0 || countB == 0 || countC == 0) {
          return
        }

        var tmpMP = (countA + countB + countC - 3) * 10 // 合成分の消費MP
        var lengthA = 0
        var lengthB = 0
        var lengthC = 0
        for (i <- 0 until n) {
          candidate(i) match {
            case 0 => lengthA += ls(i)
            case 1 => lengthB += ls(i)
            case 2 => lengthC += ls(i)
            case _ => ()
          }
        }
        // 延長/短縮分の消費MP
        tmpMP += math.abs(a - lengthA) + math.abs(b - lengthB) + math.abs(c - lengthC)

        minMP = math.min(minMP, tmpMP)
        return
      }

      for (i <- 0 until 4) {
        candidate(depth) = i
        dfs(depth + 1, candidate)
      }
    }

    dfs(0, new Array[Int](n))
    println(minMP)
  }
}
