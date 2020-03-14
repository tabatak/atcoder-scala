package panasonic_20200314.c

import java.math.{BigDecimal, MathContext}

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a, b, c = sc.nextLong()
    val abd = new BigDecimal(a)
    val bbd = new BigDecimal(b)
    val cbd = new BigDecimal(c)

    if(sqrt(abd, 50).add(sqrt(bbd, 50)).compareTo(sqrt(cbd, 50)) < 0) {
      println("Yes")
    }else {
      println("No")
    }
  }


  def sqrt(a: BigDecimal, scale: Int): BigDecimal = {
    var x = new BigDecimal(Math.sqrt(a.doubleValue), MathContext.DECIMAL64)
    if (scale < 17) return x
    val b2 = new BigDecimal(2)
    var tempScale = 16
    while ( {
      tempScale < scale
    }) {
      x = x.subtract(x.multiply(x).subtract(a).divide(x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN))

      tempScale *= 2
    }
    x
  }
}
