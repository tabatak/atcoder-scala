package abc156.b

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)

    var n, k = sc.nextInt()
    var ans = 0
    while (n > 0) {
      ans += 1
      n = n / k
    }
    println(ans)
  }
}
