package abc155.b

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val a = new Array[Int](n)
    for (i <- 0 until n) {
      a(i) = sc.nextInt()
    }

    var approved = true
    for (num <- a.filter(_ % 2 == 0)) {
      if (num % 3 != 0 && num % 5 != 0) {
        approved = false
      }
    }

    if (approved) println("APPROVED ")
    else println("DENIED ")
  }
}
