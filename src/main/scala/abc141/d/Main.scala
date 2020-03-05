package abc141.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    var m = sc.nextInt
    val pq = collection.mutable.PriorityQueue[Long]()
    for (i <- 0 until n) {
      pq.enqueue(sc.nextLong())
    }

    // 最後に合計出せばいいのか
    //    var sum = pq.toList.sum
    while (m > 0) {
      val max = pq.dequeue()
      val half = max / 2
      //      sum -= max - tmp
      pq.enqueue(half)
      m -= 1
    }

    println(pq.toList.sum)
  }
}
