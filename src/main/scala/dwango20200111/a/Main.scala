package dwango20200111.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val s = new Array[String](n)
    val t = new Array[Int](n)
    for (i <- 0 until n) {
      s(i) = sc.next
      t(i) = sc.nextInt
    }
    val x = sc.next

    var sum = 0
    var flg = false
    for(i <- 0 until n) {
      if(flg){
        sum += t(i)
      }else if(x == s(i)){
        flg = true
      }
    }

    println(sum)
  }
}
