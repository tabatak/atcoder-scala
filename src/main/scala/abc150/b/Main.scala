package abc150.b

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextLine
    val s = sc.nextLine

    var num = 0
    for(i <- 0 until s.length - 2){
      val substr = s.substring(i, i + 3)
      if(substr == "ABC") {
        num += 1
      }
    }

    println(num)
  }
}
