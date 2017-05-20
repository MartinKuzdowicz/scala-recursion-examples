package com.mkuzdowicz.exercises.recursion


object Fibonacci extends App {

  def fibWithRecursion(n: Int): Long = {
    if (n <= 2) return 1 else fibWithRecursion(n - 1) + fibWithRecursion(n - 2)
  }

  def fibWithRecursionAndMemoization(n: Int, memo: collection.mutable.Map[Int, Long]): Long = {
    if (n <= 2) {
      return 1
    } else if (!memo.contains(n)) {
      val currentRes: Long = fibWithRecursionAndMemoization(n - 1, memo) + fibWithRecursionAndMemoization(n - 2, memo)
      memo += n -> currentRes
    }
    memo.get(n).get
  }

  def fibWithIteration(n: Int): Long = {
    val fibNums: Array[Long] = new Array[Long](n)
    for (x <- (0 to fibNums.length - 1)) {
      if (x < 2) {
        fibNums(x) = (1)
      }
      else {
        val current = fibNums(x - 1) + fibNums(x - 2)
        fibNums(x) = current
      }
    }
    fibNums.last
  }

  val timeBeforeCall = System.currentTimeMillis()

  val memo = collection.mutable.Map[Int, Long]();

  println(fibWithRecursionAndMemoization(50, memo))

  println(fibWithRecursionAndMemoization(120, memo))

  val timeAfterCall = System.currentTimeMillis()

  val executionTime = timeAfterCall - timeBeforeCall

  println(s"fibWithRecursion was executed in ${executionTime} milliseconds")

}
