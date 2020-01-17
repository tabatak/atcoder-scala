package abc098.c

object Main extends App {
  solve2

  private def solve2: Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    sc.nextLine
    var s = sc.nextLine.toCharArray


    var wCount = 0
    var eCount = s.tail.count(_ == 'E')
    var ans = eCount
    for (i <- 1 until n) {
      if (s(i - 1) == 'W') {
        wCount += 1
      }
      if (s(i) == 'E') {
        eCount -= 1
      }
      ans = math.min(ans, wCount + eCount)
    }
    println(ans)

  }


  private def solve1: Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    sc.nextLine
    var s = sc.nextLine.toCharArray

    var ans = 1001001001
    for (i <- 0 until n) {
      val sum = s.slice(0, i).count(_ == 'W') + s.slice(i + 1, n).count(_ == 'E')
      ans = math.min(ans, sum)
    }
    println(ans)

  }
}
