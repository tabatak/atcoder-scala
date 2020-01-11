package agc020.a

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n, a, b = sc.nextInt

    // 両者の間のマスの数が奇数ならAlice、偶数ならBorysの勝ち
    println(if((b-a-1) % 2 == 0) "Borys" else "Alice")
  }
}
