package abc071.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val a = new Array[Int](n)
    val mp = scala.collection.mutable.Map[Long, Long]()
    for (i <- 0 until n) {
      a(i) = sc.nextInt()
      if (mp.contains(a(i))) mp(a(i)) += 1
      else mp.put(a(i), 1)
    }

    val lengths = mp.filter(_._2 >= 2).keys.toList.sorted
    if (lengths.size == 0) {
      println(0)
    } else {
      val (firstLength, firstNums) = (lengths(lengths.size - 1), mp(lengths(lengths.size - 1)))
      if (firstNums >= 4) {
        println(firstLength * firstLength)
      } else if (lengths.size >= 2) {
        val secondLength = lengths(lengths.size - 2)
        println(firstLength * secondLength)
      } else {
        println(0)
      }
    }

  }
}
