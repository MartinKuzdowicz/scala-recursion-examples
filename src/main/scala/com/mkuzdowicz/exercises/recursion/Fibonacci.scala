package com.mkuzdowicz.exercises.recursion


object Fibonacci {

  def fibWithRecursion(n:Int): Long = {
    if (n <= 2) return 1 else fibWithRecursion(n-1) + fibWithRecursion(n-2)
  }

  def fibWithIteration(n:Int): Long = {
    val fibNums:Array[Long] = new Array[Long](n)
    for (x <- (0 to fibNums.length-1)) {
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

}
