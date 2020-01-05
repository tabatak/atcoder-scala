package abc085.b

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  var list = List.fill(n)(sc.nextInt)

  println(list.distinct.length)
}
