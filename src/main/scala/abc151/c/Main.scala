package abc151.c

import scala.collection.mutable.ListBuffer

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, m = sc.nextInt
    val p = new Array[Int](m)
    val s = new Array[String](m)
    for (i <- 0 until m) {
      p(i) = sc.nextInt
      s(i) = sc.next
    }
    val acNos = scala.collection.mutable.Set[Int]()
    val penaCounts = scala.collection.mutable.Map[Int, Int]()
    var acs = 0
    for (i <- 0 until m) {
      if (!acNos.contains(p(i))) {
        if (s(i) == "AC") {
          acs += 1
          acNos += p(i)
        } else if (s(i) == "WA") {
          penaCounts.put(p(i), penaCounts.getOrElse(p(i), 0) + 1)
        }
      }
    }

    var penas = 0
    for(i <- acNos.toList) {
      val penaConunt = penaCounts.getOrElse(i, 0)
      penas += penaConunt
    }

    println(acs + " " + penas)
  }

}
