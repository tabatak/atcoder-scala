package agc013.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    sc.nextLine
    //    var list = Array.fill(n)(sc.nextInt)
    var list = sc.nextLine.split(" ").map(_.toInt)

    var count = 1
    var direction = 0
    var before = list(0)
    for (i <- 1 until n) {
      val num = list(i)
      if (before != num) {
        if (direction == 0) {
          direction = before - num // 方向を確定
        } else {
          if ((direction > 0 && before < num) || (direction < 0 && before > num)) {
            direction = 0
            count += 1
          }
        }
      }
      before = num
    }

    println(count)
  }
}
