package com.mkuzdowicz.exercises.recursion

object Factorial {

  def factorialWithIteration(n:Int): Int = {
    var fact = 1
    for (x <- (1 to n)) {
      if (x > 0)
        fact *= x
    }
    fact
  }

  def factorialWithRecursion(n:Int): Int = {
    if (n <= 0)
      return 1
    n * factorialWithRecursion(n-1)
  }

}
