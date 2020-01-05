package abc083.b

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, a, b = sc.nextInt

  var sum = 0
//  for(i <- 0 to n) {
//    val s = i.toString.toList
//    val tmp = s.map(_.asDigit).sum
//    if(tmp >= a && tmp <= b) sum += i
//  }
  for(i <- 0 to n) {
    val v = findSumOfDigits(i)
    if(v >= a && v <= b) {
      sum += i
    }
  }
  println(sum)


  def findSumOfDigits(n: Int): Int = {
    var sum = 0
    var tmp = n
    while(tmp > 0) {
      sum += tmp % 10
      tmp = tmp / 10
    }
    sum
  }
}
