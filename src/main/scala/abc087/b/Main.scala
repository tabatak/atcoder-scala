package abc087.b

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, c, x = sc.nextInt

  var count = 0
  for(d <- 0 to a; e <- 0 to b; f <- 0 to c){
    if(x == 500 * d + 100 * e + 50 * f) count += 1
  }
  println(count)
}
