package abc157.d

import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, m, k = sc.nextInt()
    val users = Array.fill[User](n)(User(new ArrayBuffer[Int](), new ArrayBuffer[Int]()))

    for (i <- 0 until m) {
      val a = sc.nextInt() - 1
      val b = sc.nextInt() - 1
      users(a).friends.append(b)
      users(b).friends.append(a)
    }
    for (i <- 0 until k) {
      val c = sc.nextInt() - 1
      val d = sc.nextInt() - 1
      users(c).blocks.append(d)
      users(d).blocks.append(c)
    }

    val pw = new java.io.PrintWriter(System.out)
    for (i <- 0 until n) {
      val ans = search(i, users)
      pw.println(ans)
    }
    pw.flush()
  }

  def search(target: Int, users: Array[User]): Int = {
    val queue = scala.collection.mutable.Queue[Int]()
    val checked = new ArrayBuffer[Int]()
    val friends = users(target).friends
    val blocks = users(target).blocks
    var ans = 0

    users(target).friends.foreach(queue.enqueue(_))

    while (!queue.isEmpty) {
      val num = queue.dequeue()
      if (target != num && !checked.contains(num)) {
        if (!friends.contains(num) && !blocks.contains(num)) {
          ans += 1
        }

        checked.append(num)
        users(num).friends.foreach { f =>
          if (f != target && !checked.contains(f)) {
            queue.enqueue(f)
          }
        }
      }
    }

    return ans
  }

  case class User(friends: ArrayBuffer[Int], blocks: ArrayBuffer[Int])

}

