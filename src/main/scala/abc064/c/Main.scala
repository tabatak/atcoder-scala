package abc064.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = new Array[Int](n)
    for (i <- 0 until n) {
      a(i) = sc.nextInt
    }

    val colors = scala.collection.mutable.Set[String]()
    var over3200 = 0
    for (i <- 0 until n) {
      if (a(i) <= 399) colors.add("grey")
      else if (a(i) <= 799) colors.add("brown")
      else if (a(i) <= 1199) colors.add("green")
      else if (a(i) <= 1599) colors.add("light_blue")
      else if (a(i) <= 1999) colors.add("blue")
      else if (a(i) <= 2399) colors.add("yellow")
      else if (a(i) <= 2799) colors.add("orange")
      else if (a(i) <= 3199) colors.add("red")
      else over3200 += 1
    }

    val min = if (colors.size != 0) colors.size else 1
    val max = colors.size + over3200
    println(min + " " + max)

  }
}
