package abc126.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, k = sc.nextInt

    var ans = 0d;
    for (i <- 1 to n) {
      var p = 1d
      var x = i
      while (x < k) {
        p = p * 0.5
        x = x * 2
      }
      ans += p / n
    }
    println(ans)
  }
}
