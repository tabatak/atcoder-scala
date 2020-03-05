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

    var sum = pq.toList.sum
    while (m > 0) {
      val max = pq.dequeue()
      val tmp = max / 2
      sum -= max - tmp
      pq.enqueue(tmp)
      m -= 1
    }

    println(sum)
  }
}
