package abc153.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    var h, n = sc.nextInt
    val abc = new Array[(Long, Long, Double)](n)
    var max = -1L
    var min = Long.MaxValue
    for (i <- 0 until n) {
      val a = sc.nextLong
      val b = sc.nextLong
      val c = a.toDouble / b. toDouble  //効率的な値
      abc(i) = (a, b, c)
      max = math.max(max, a)
      min = math.min(min, a)
    }
    val sorted = abc.sortBy(_._3).reverse
    println(sorted.toList)

    var mp = 0
    while(h > 0) {
      for(v <- abc) {
        
      }
    }

  }
}
