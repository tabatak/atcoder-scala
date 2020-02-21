package abc089.c

import scala.collection.mutable

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    sc.nextLine()
    val s = new Array[String](n)
    val mp = scala.collection.mutable.Map[Char, Int]()
    for (i <- 0 until n) {
      s(i) = sc.nextLine()
      val index = s(i)(0)
      if (index == 'M' || index == 'A' || index == 'R' || index == 'C' || index == 'H') {
        if (!mp.contains(index)) {
          mp.put(index, 1)
        }
        else {
          mp(index) += 1
        }
      }
    }
    // 5から3つえらぶ
    val keyNum = mp.keys.size
    println(keyNum)

  }
}
