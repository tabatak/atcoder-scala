package abc079.c

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.nextLine
  val nums = Array.fill(4)(0)
  nums(0) = s.substring(0, 1).toInt
  nums(1) = s.substring(1, 2).toInt
  nums(2) = s.substring(2, 3).toInt
  nums(3) = s.substring(3, 4).toInt

  // パターンをビット列で列挙するはず
  var ans = ""
  for (i <- 0 to 7) {
    var sum = nums(0)
    var str = nums(0).toString
    for (j <- 0 to 2) {
      if ((i & (1 << j)) > 0) {
        sum += nums(j + 1)
        str = str + "+" + nums(j + 1).toString
      } else {
        sum -= nums(j + 1)
        str = str + "-" + nums(j + 1).toString
      }
    }
    if (sum == 7) {
      ans = str + "=7"
    }
  }
  println(ans)
}
