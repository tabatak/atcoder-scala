package abc074.c

import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]): Unit = {
    solve
  }

  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a, b, c, d, e, f = sc.nextInt

    // 水の重さのパターンを列挙
    val waterWeights = ArrayBuffer[Int]()
    for (i <- 0 until f; j <- 0 until f) {
      val waterWeight = 100 * a * i + 100 * b * j
      if (waterWeight <= f) {
        waterWeights += waterWeight
      }
    }

    // 砂糖の重さのパターンを列挙
    val sugarWeights = ArrayBuffer[Int]()
    for (i <- 0 until f; j <- 0 until f) {
      val sugarWeight = c * i + d * j
      if (sugarWeight <= f) {
        sugarWeights += sugarWeight
      }
    }

    // 砂糖水の重さを探索
    var maxDense = 0d
    var maxSugarWaterWeight = 0
    var maxSugarWeight = 0
    for (waterWeight <- waterWeights.distinct; sugarWeight <- sugarWeights.distinct) {
      val sugarWaterWeight = waterWeight + sugarWeight

      if (sugarWaterWeight > 0 && sugarWaterWeight <= f && sugarWeight <= (waterWeight * e / 100)) {
        val dense = sugarWeight.doubleValue * 100 / sugarWaterWeight.doubleValue
        if (maxDense <= dense) {
          maxDense = dense
          maxSugarWaterWeight = sugarWaterWeight
          maxSugarWeight = sugarWeight
        }
      }
    }

    println(maxSugarWaterWeight + " " + maxSugarWeight)
  }

}
