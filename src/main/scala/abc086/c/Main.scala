package abc086.c

import scala.math.abs

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }


  //  val sc = new java.util.Scanner(System.in)
  //  val n = sc.nextInt
  //  val list: Array[Array[Int]] = Array.fill[Int](n, 3)(sc.nextInt)
  //  //  val b = Breaks
  //
  //  var before = Array[Int](0, 0, 0)
  //  val canTravel = list.forall {
  //    target =>
  //      val step = target(0) - before(0)
  //      val distance = abs(target(1) - before(1)) + abs(target(2) - before(2))
  //      before = target
  //      if (step < distance || step % 2 != distance % 2) {
  //        false
  //      } else {
  //        true
  //      }
  //  }


  //  b.breakable {
  //    for (i <- 1 until list.length) {
  //      val step = list(i)(0) - list(i - 1)(0)
  //      val distance = abs(list(i)(1) - list(i - 1)(1)) + abs(list(i)(2) - list(i - 1)(2))
  //
  //      if (step < distance || step % 2 != distance % 2) {
  //        canTravel = false
  //        b.break
  //      }
  //    }
  //  }

  //  println(if (canTravel) "Yes" else "No")

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt

    var (bt, bx, by) = (0, 0, 0)
    var canTravel = true
    for (i <- 1 to n) {
      if (canTravel) {
        val t, x, y = sc.nextInt
        val step = t - bt
        val distance = abs(x - bx) + abs(y - by)
        if (step < distance || step % 2 != distance % 2) {
          canTravel = false
        }
        bt = t
        bx = x
        by = y
      }
    }
    println(if (canTravel) "Yes" else "No")
  }
}
