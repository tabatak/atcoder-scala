package abc065.b

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  var a = Array.fill(n)(sc.nextInt)

  var ans = false
  var checked = false
  // チェック済みのインデックスを保持（以降は同じところをまわる）
  val checkedIndex = scala.collection.mutable.Set[Int]()
  var i = 0
  var count = 0
  while (ans == false && checked == false) {
    count += 1
    if (a(i) == 2) {
      ans = true
    } else {
      val tmp = a(i) - 1
      if (checkedIndex.contains(tmp)) {
        checked = true
      } else {
        checkedIndex.add(tmp)
      }
      i = tmp
    }
  }

  println(if (ans) count else -1)

}
