package abc085.c
import scala.util.control.Breaks

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, y = sc.nextInt

  val b = new Breaks
  var flg = false
  b.breakable{
    for(i <- n to 0 by -1; j <- (n - i) to 0 by -1) {
      val v = 10000 * i + 5000 * j + 1000 * (n - i - j)
      if(v == y){
        println(i + " " + j + " " + (n - i - j))
        flg = true
        b.break
      }
    }
  }

  if(!flg){
    println("-1 -1 -1")
  }
}
