package abc087.c

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  var listA1 = Array.fill(n)(sc.nextInt)
  var listA2 = Array.fill(n)(sc.nextInt)

  var ans = 0
  for (i <- 0 until n) {
    val sum = listA1.slice(0, i + 1).sum + listA2.slice(i, n).sum
    ans = math.max(ans, sum)
  }
  println(ans)
}
