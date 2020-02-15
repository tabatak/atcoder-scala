package abc144.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextLong

    var min = Long.MaxValue
    for (i <- 1 to math.sqrt(n).toInt) {
      if (n % i == 0) {
        min = math.min(min, i + n / i - 2)
      }
    }
    println(min)
  }
}
