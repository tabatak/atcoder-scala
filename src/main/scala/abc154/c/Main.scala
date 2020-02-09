package abc154.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Long](n)
    for (i <- 0 until n) {
      a(i) = sc.nextLong
    }

    val st = scala.collection.mutable.Set.empty[Long]
    var flg = true
    var index = 0
    while (flg && index < n) {
      if (st.contains(a(index))) flg = false
      else st.add(a(index))
      index += 1
    }


    println(if (flg) "YES" else "NO")
  }
}
