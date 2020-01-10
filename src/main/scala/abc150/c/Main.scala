package abc150.c

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    var p = Array.fill(n)(sc.nextInt)
    var q = Array.fill(n)(sc.nextInt)

    val permutations = (1 to n).permutations.toList
    val px = permutations.indexOf(p.toVector)
    val qx = permutations.indexOf(q.toVector)
    println(math.abs(px - qx))
  }
}
