package abc158.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a, b = sc.nextInt()

    var ans = 1
    var flg = false
    while (!flg && ans <= 10000) {
      val taxA = (ans * 0.08).toInt
      val taxB = (ans * 0.1).toInt
      if (taxA == a && taxB == b) {
        flg = true
      } else {
        ans += 1
      }
    }

    println(if (flg) ans else -1)
  }
}
