package abc073.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    import scala.io.StdIn._
    val n = readInt
    val st = scala.collection.mutable.Set[Long]()
    for (i <- 0 until n) {
      val a = readLong
      if(st.contains(a)) st.remove(a) else st.add(a)
    }

    println(st.size)
  }
}
