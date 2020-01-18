package keyence20200118.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val h, w, n = sc.nextInt

    val num = math.max(h, w)
    println(if(n % num == 0) n / num else n / num +1)
  }

}
