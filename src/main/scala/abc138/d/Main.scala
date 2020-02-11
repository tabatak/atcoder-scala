package abc138.d

import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]): Unit = {
    solve2
  }

  def solve2(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, q = sc.nextInt
    val to = Array.fill[ArrayBuffer[Int]](n)(ArrayBuffer.empty[Int])

    for (i <- 0 until n - 1) {
      val a = sc.nextInt - 1
      val b = sc.nextInt - 1
      to(a).append(b)
      to(b).append(a)
    }

    val ans = Array.fill[Long](n)(0L)
    for (i <- 0 until q) {
      val p = sc.nextInt - 1
      val x = sc.nextInt
      ans(p) += x
    }

    var stack = scala.collection.mutable.Stack[Int](0)
    val isVisited = Array.fill[Boolean](n)(false)
    while (stack.nonEmpty) {
      val top = stack.pop()
      isVisited(top) = true
      for (next <- to(top); if (!isVisited(next))) {
        ans(next) += ans(top)
        stack.push(next)
      }
    }
    println(ans.mkString(" "))
  }

  // こちらでは何回やってもREが出てしまう。。原因が解明できなかった。。
  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, q = sc.nextInt
    val to = Array.fill[ArrayBuffer[Int]](n)(ArrayBuffer.empty[Int])

    for (i <- 0 until n - 1) {
      val a = sc.nextInt - 1
      val b = sc.nextInt - 1
      to(a).append(b)
      to(b).append(a)
    }

    val ans = Array.fill[Long](n)(0L)
    for (i <- 0 until q) {
      val p = sc.nextInt - 1
      val x = sc.nextInt
      ans(p) += x
    }

    def dfs(v: Int, p: Int = -1): Unit = {
      for (u <- to(v)) {
        if (u != p) {
          ans(u) += ans(v)
          dfs(u, v)
        }
      }
    }

    dfs(0, -1)

    println(ans.mkString(" "))
  }
}
