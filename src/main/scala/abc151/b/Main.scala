package abc151.b

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, k, m = sc.nextInt
    var list = List.fill(n - 1)(sc.nextInt)
    if ((m * n) <= list.sum) {
      println(0)
    } else if
    ((m * n) - (list.sum) <= k) {
      println((m * n) - (list.sum))
    }
    else {
      println(-1)
    }
  }

}
