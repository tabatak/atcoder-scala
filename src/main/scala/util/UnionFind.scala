package util

import scala.collection.mutable.ArrayBuffer

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

