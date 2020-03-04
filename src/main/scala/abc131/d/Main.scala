package abc131.d

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val tasks = new Array[Task](n)
    for (i <- 0 until n) {
      tasks(i) = Task(
        sc.nextInt(),
        sc.nextInt()
      )
    }

    val sortedTasks = tasks.sortBy(_.limit)

    var ans = true
    var fromStart = 0
    for (task <- sortedTasks) {
      fromStart += task.cost
      if (fromStart > task.limit) {
        ans = false
      }
    }

    println(if (ans) "Yes" else "No")
  }


  case class Task(cost: Int, limit: Int)

}
