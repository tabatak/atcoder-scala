package abc081.b

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  var list = List.fill(n)(sc.nextInt)

  var count = 0
  while (list.forall(_ % 2 == 0)){
    count += 1
    list = list.map(_ / 2)
  }
  println(count)
}
