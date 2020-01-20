package abc152.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }


  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt

    val frequency = scala.collection.mutable.Map[(Int, Int), Int]()
    for (i <- 1 to n) {
      val f = getFreqKey(i)
      if (frequency.contains(f)) frequency(f) += 1
      else frequency.put(f, 1)
    }

    var ans = 0
    for (i <- 1 to n) {
      val tmp = getFreqKey(i)
      val f = (tmp._2, tmp._1)
      if (frequency.contains(f)) ans += frequency(f)
    }

    println(ans)
  }

  def getFreqKey(x: Int): (Int, Int) = {
    val a = x % 10
    var b = 0
    var tmp = x
    while (tmp != 0) {
      b = tmp
      tmp = tmp / 10
    }
    (a, b)
  }
}
