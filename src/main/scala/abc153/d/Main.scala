package abc153.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    var h = sc.nextLong

    var count = 0
    while (h > 1) {
      count += 1
      h = h / 2
    }

    var num = 0L
    for (i <- 0 to count) {
      num += math.pow(2, i).toLong
    }
    println(num)

  }
}