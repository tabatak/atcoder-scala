package abc149.c

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  var n = sc.nextInt

  var ans = 0
  while (ans == 0) {
    if (isPrime3(n)) ans = n
    n += 1
  }
  println(ans)

  def isPrime3(x: Int): Boolean = {
    if (x == 1) false
    else (2 to math.sqrt(x).toInt).forall(x % _ != 0)
  }

  def isPrime(x: Int): Boolean = {
    var result = true
    if (x > 1) {
      for (i <- 2 until x) {
        if (x % i == 0) {
          result = false
        }
      }
    } else {
      result = false
    }
    result
  }

  def isPrime2(x: Int): Boolean = {
    var result = true
    if (x > 1) {
      for (i <- 2 to math.sqrt(x).toInt) {
        if (x % i == 0) {
          result = false
        }
      }
    } else {
      result = false
    }
    result
  }
}
