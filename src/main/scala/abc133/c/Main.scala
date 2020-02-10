package abc133.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val l = sc.nextLong
    var r = sc.nextLong
    r = math.min(r, l + 2019 * 2)

    var ans = 2018L
    for (i <- l to r) {
      for (j <- i + 1 to r) {
        val x = i * j % 2019L
        ans = math.min(ans, x)
      }
    }
    println(ans)
  }
}
