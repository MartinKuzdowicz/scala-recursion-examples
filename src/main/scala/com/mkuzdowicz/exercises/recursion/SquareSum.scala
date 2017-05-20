package com.mkuzdowicz.exercises.recursion

object SquareSum {

  def squareSumRecursive(n: Int): Int = if (n < 2) 1 else n * n + squareSumRecursive(n - 1)

  def squareSumIteratively(n: Int): Int = {
    (1 to n).map(x => x * x).reduce((x, bucket) => x + bucket)
  }

}
