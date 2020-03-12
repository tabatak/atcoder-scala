package abc007.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val row, col = sc.nextInt
    val sy = sc.nextInt - 1
    val sx = sc.nextInt - 1
    val gy = sc.nextInt - 1
    val gx = sc.nextInt - 1
    sc.nextLine()

    val maze: Array[String] = new Array[String](row)
    for (i <- 0 until row) {
      maze(i) = sc.nextLine()
    }

    val dx = Array[Int](1, 0, -1, 0)
    val dy = Array[Int](0, 1, 0, -1)

    val d: Array[Array[Int]] = Array.fill[Array[Int]](row)(Array.fill[Int](col)(-1))
    d(sy)(sx) = 0

    val q = scala.collection.mutable.Queue[(Int, Int)]()
    q.enqueue((sx, sy))
    while (!q.isEmpty) {
      val p = q.dequeue()
      val cx = p._1
      val cy = p._2
      if (!(cx == gx && cy == gy)) {
        for (i <- 0 until 4) {
          val nx = cx + dx(i)
          val ny = cy + dy(i)

          if (0 <= nx && nx < col && 0 <= ny && ny < row && maze(ny)(nx) != '#' && d(ny)(nx) == -1) {
            q.enqueue((nx, ny))
            d(ny)(nx) = d(cy)(cx) + 1
          }
        }
      }
    }

    println(d(gy)(gx))

  }
}
