package abc150.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, m = sc.nextInt
    sc.nextLine
    var a = sc.nextLine.split(" ").map(_.toInt).distinct.toList


    //先頭の要素でつくってみる
    val firstSet = scala.collection.mutable.Set[Int]()
    var j = 1
    while(a(0) * (j + 0.5) <= m) {
      firstSet.+=((a(0) * (j + 0.5)).toInt)
      j += 1
    }
    // 結果集合
    var resultSet = firstSet
    println(firstSet)

    // 残りをresultSetとぶつけてみる
    val tmpSet = scala.collection.mutable.Set[Int]()
    for(i <- 1 until a.length) {
      var j = 1
      while(a(i) * (j + 0.5) <= m) {
        tmpSet.+=((a(i) * (j + 0.5)).toInt)
        j += 1
      }
      println(tmpSet)

      resultSet = resultSet & tmpSet
    }

    println(resultSet.size)
  }

}
