package abc157.d

import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]): Unit = {
    solve2
  }


  def solve2(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, m, k = sc.nextInt()
    val users = Array.fill[User](n)(User(new ArrayBuffer[Int](), new ArrayBuffer[Int]()))
    val uf = new UnionFind(n)

    for (i <- 0 until m) {
      val a = sc.nextInt() - 1
      val b = sc.nextInt() - 1
      users(a).friends.append(b)
      users(b).friends.append(a)

      uf.unite(a, b)
    }
    for (i <- 0 until k) {
      val c = sc.nextInt() - 1
      val d = sc.nextInt() - 1
      users(c).blocks.append(d)
      users(d).blocks.append(c)
    }

    val pw = new java.io.PrintWriter(System.out)
    for (i <- 0 until n) {

      // 連結成分の数 - 自分自身 - 友達の数
      var ans = uf.size(i) - 1 - users(i).friends.size
      for (block <- users(i).blocks) {
        if (uf.same(i, block)) {
          // ブロック対象が同じ連結成分に存在したら、友達候補から減算する
          ans -= 1
        }
      }
      pw.println(ans)
    }
    pw.flush()
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

class UnionFind(n: Int) {
  private val d: ArrayBuffer[Int] = ArrayBuffer.fill[Int](n)(-1)

  def find(x: Int): Int = {
    if (d(x) < 0) {
      return x
    }
    else {
      d(x) = find(d(x))
      return d(x)
    }
  }

  def unite(x: Int, y: Int): Boolean = {
    // 根同士をくっつけるため根を取得
    val tmpX = find(x)
    val tmpY = find(y)
    if (tmpX == tmpY) {
      // 同じ連結成分内にどちらも存在するため、連結不要！
      return false
    }

    if (d(tmpX) < d(tmpY)) {
      // x方が集合が大きい場合、y->xの向きにくっつける
      d(tmpX) += d(tmpY)
      d(tmpY) = tmpX
    } else {
      // その逆
      d(tmpY) += d(tmpX)
      d(tmpX) = tmpY
    }

    return true
  }

  def same(x: Int, y: Int): Boolean = {
    find(x) == find(y)
  }

  def size(x: Int): Int = {
    -d(find(x))
  }
}

