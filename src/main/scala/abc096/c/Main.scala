package abc096.c

import scala.math._

object Main {
  def main(args: Array[String]): Unit = {
    solve2
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a, b, c, x, y = sc.nextInt

    val aPrice = min(a, c * 2)
    val bPrice = min(b, c * 2)
    val abPrice = min(a + b, c * 2)
    val abFlg = a != aPrice || b != bPrice || (a + b) != abPrice

    val payment =
      if (abFlg) {
        val abPayment = abPrice * min(x, y)
        val notAbPayment =
          if (x == y) 0
          else if (x < y) (y - x) * bPrice
          else (x - y) * aPrice
        abPayment + notAbPayment
      } else {
        x * aPrice + y * bPrice
      }

    println(payment)

  }

  def solve2(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a, b, c, x, y = sc.nextInt

    var minPayment = Long.MaxValue
    for (abNum <- 0 until max(x, y) * 2) {
      val payment = (c * 2 * abNum) + (a * max(0, x - abNum)) + b * max(0, y - abNum)
      minPayment = min(minPayment, payment)
    }
    println(minPayment)

  }
}