package abc060.b

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, c = sc.nextInt

  var num = 1
  var ans = false
  while (num <= b) {
    if (a * num % b == c) ans = true
    num += 1
  }
  println(if (ans) "YES" else "NO")
}
