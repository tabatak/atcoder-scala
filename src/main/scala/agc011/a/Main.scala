package agc011.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, c, k = sc.nextInt
    var list = Array.fill(n)(sc.nextInt).sorted

    var count = 1
    var g = list(0) + k
    var num = 1
    for(t <- list.tail) {
      if(t > g || num == c) {
        count += 1
        num = 1
        g = t + k
      }else{
        num += 1
      }
    }

    println(count)
  }
}
