package abc057.c

import scala.math.{min, max, sqrt}

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextLong

    var minDigit = n.toString.length
    var i = 1L
    while(i <= sqrt(n)){
      if(n % i == 0) {
        minDigit = min(minDigit, max(i.toString.length, (n / i).toString.length))
      }
      i += 1
    }

    println(minDigit)
  }
}
