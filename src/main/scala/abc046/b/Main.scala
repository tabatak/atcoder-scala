package abc046.b

import scala.math.pow

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, k = sc.nextLong
  println(k * pow((k - 1), (n - 1)).toLong)
}
