package com.mkuzdowicz.exercises.recursion

object SquareSum {

  def squareSumRecursive(n: Int): Int = if (n < 2) 1 else n * n + squareSumRecursive(n - 1)

}
