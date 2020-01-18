package keyence20200118.b

import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    var robots = ArrayBuffer[(Long, Long)]()
    for (i <- 0 until n) {
      val x = sc.nextLong
      val l = sc.nextLong
      robots.+=((x, l))
    }
    robots = robots.sortBy(_._1)

    var robotCount = n
    var before = robots(0)
    for (i <- 1 until n) {
      val beforeMax: Long = before._1 + before._2
      val currentMin: Long = robots(i)._1 - robots(i)._2
      val currentMax: Long = robots(i)._1 + robots(i)._2
      if (beforeMax > currentMin) {
        robotCount -= 1
        if (beforeMax > currentMax) {
          before = robots(i)
        }
      } else {
        before = robots(i)
      }
    }
    println(robotCount)
  }

}
