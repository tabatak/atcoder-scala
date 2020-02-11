package util

object Util {
  // 上下左右
  val DI = Array(-1, 0, 1, 0)
  val DJ = Array(0, -1, 0, 1)


  def gcd(x: Long, y: Long): Long = {
    if (x == 0) y
    else gcd(y % x, x)
  }
}
