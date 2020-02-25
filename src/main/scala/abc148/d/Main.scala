package abc148.d

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val a = new Array[Int](n)
  for (i <- 0 until n) {
    a(i) = sc.nextInt()
  }

  var currentNum = 0
  for(num <- a) {
    if(currentNum + 1 == num) currentNum += 1
  }
  println(if(currentNum == 0) -1 else n - currentNum)

// ↓最初の解答
//  if (!a.contains(1)) {
//    println(-1)
//  } else {
//    var breakCount = 0
//    var currentNum = 1
//    for (i <- 0 until n) {
//      if (a(i) == currentNum) {
//        currentNum += 1
//      } else {
//        breakCount += 1
//      }
//    }
//    println(breakCount)
//  }
}
