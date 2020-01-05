package abc088.b

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  var list = List.fill(n)(sc.nextInt)

  var aliceSum = 0
  var bobSum = 0
//  list.sorted.reverse.zipWithIndex.foreach{
//    v =>
//      if(v._2 % 2 == 0) aliceSum += v._1
//      else bobSum += v._1
//  }
  var index = 0
  list.sortWith((x, y) => x > y).foreach {
    v =>
      if (index % 2 == 0) {
        aliceSum += v
      } else {
        bobSum += v
      }
      index += 1
  }

  println(aliceSum - bobSum)
}
