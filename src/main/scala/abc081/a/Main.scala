package abc081.a

object Main extends App {

  val sc = new java.util.Scanner(System.in)
  val s = sc.nextLine

  println(s.filter(_ == '1').length)
}
