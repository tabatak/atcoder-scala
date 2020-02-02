package abc111.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  // 処理の方法はわかるけれど、全然整理できたコードにならない。。
  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val v = new Array[Int](n)
    for (i <- 0 until n) {
      v(i) = sc.nextInt
    }

    val evenMap = scala.collection.mutable.Map[Int, Int]()
    for (i <- 0 until n by 2) {
      val num = v(i)
      if (evenMap.contains(num)) evenMap(num) += 1
      else evenMap(num) = 1
    }
    val evenList = evenMap.toList.sortBy(_._2).reverse

    val oddMap = scala.collection.mutable.Map[Int, Int]()
    for (i <- 1 until n by 2) {
      val num = v(i)
      if (oddMap.contains(num)) oddMap(num) += 1
      else oddMap(num) = 1
    }
    val oddList = oddMap.toList.sortBy(_._2).reverse

    val e1 = evenList(0)._1
    val e2 = if (evenList.size > 1) evenList(1)._1 else -1
    val o1 = oddList(0)._1
    val o2 = if (oddList.size > 1) oddList(1)._1 else -1

    if (e1 != o1) {
      println(n - evenMap(e1) - oddMap(o1))

    } else {
      println(math.min(
        (n - evenMap(e1) - oddMap.getOrElse(o2, 0)),
        (n - oddMap(o1) - evenMap.getOrElse(e2, 0)))
      )
    }
  }

}
