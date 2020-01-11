package abc072.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Int](n)
    for (i <- 0 until n) {
      a(i) = sc.nextInt
    }

    val nums = scala.collection.mutable.Map[Int, Int]()
    for (i <- a) {
      // -1
      nums.put(i - 1, nums.get(i - 1).fold(1)(_ + 1))
      // 0
      nums.put(i, nums.get(i).fold(1)(_ + 1))
      // +1
      nums.put(i + 1, nums.get(i + 1).fold(1)(_ + 1))
    }

    println(nums.values.max)
  }
}
