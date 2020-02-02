package abc110.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val s = sc.nextLine.toCharArray
    val t = sc.nextLine.toCharArray


    val mp = scala.collection.mutable.Map[Char, Char]()

    //アルファベットの対応付けを記録して、異なる場合はfalse
    var matched = true
    var index = 0
    while (matched && index < s.length) {
      if (mp.contains(s(index)) && mp(s(index)) != t(index)) {
        matched = false
      } else {
        mp.put(s(index), t(index))
      }
      index += 1
    }
    if(mp.values.toList.distinct.length != mp.keys.toList.distinct.length) {
      matched = false
    }

    println(if (matched) "Yes" else "No")
  }

}
