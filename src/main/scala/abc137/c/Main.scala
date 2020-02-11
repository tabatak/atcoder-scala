package abc137.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    sc.nextLine
    val mp = scala.collection.mutable.Map[String, Long]()
    for (i <- 0 until n) {
      val s = sc.nextLine.toSeq.sorted.toString
      if (mp.contains(s)) {
        mp(s) = mp(s) + 1
      } else {
        mp(s) = 1
      }
    }
    var count = 0L
    for (key <- mp.keys) {
      val c = mp(key)
      count += c * (c - 1) / 2
    }

    println(count)
  }
}
