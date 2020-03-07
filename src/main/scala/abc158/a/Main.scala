package abc158.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val s = sc.nextLine.toCharArray
    val first = s(0)
    var ans = true
    for (i <- 1 until 3) {
      if (s(i) != first) {
        ans = false
      }
    }
    println(if (ans) "No" else "Yes")
  }
}
