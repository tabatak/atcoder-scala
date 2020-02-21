package abc089.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    sc.nextLine()
    val s = new Array[String](n)
    val mp = scala.collection.mutable.Map[Char, Long](
      ('M', 0), ('A', 0), ('R', 0), ('C', 0), ('H', 0))
    for (i <- 0 until n) {
      s(i) = sc.nextLine()
      val index = s(i)(0)
      if (index == 'M' || index == 'A' || index == 'R' || index == 'C' || index == 'H') {
        mp(index) += 1
      }
    }

    var ans = 0L
    val values = mp.values.toList
    for (i <- 0 until 5; j <- i + 1 until 5; k <- j + 1 until 5) {
      ans += values(i) * values(j) * values(k)
    }

    println(ans)
  }
}
