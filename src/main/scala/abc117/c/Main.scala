package abc117.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, m = sc.nextInt
    val xs = new Array[Int](m)
    for (i <- 0 until m) {
      xs(i) = sc.nextInt
    }

    val sortedXs = xs.sorted
    val diffs = new Array[Int](m - 1)
    for (i <- 0 until m - 1) {
      diffs(i) = sortedXs(i + 1) - sortedXs(i)
    }
    val ans = diffs.sorted.slice(0, diffs.length - (n - 1)).sum
    println(ans)

  }
}
