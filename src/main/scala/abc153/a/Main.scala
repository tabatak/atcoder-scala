package abc153.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    var h, a = sc.nextInt


    var count = 0
    while(h > 0) {
      count += 1
      h -= a
    }
    println(count)
  }
}
