package com.mkuzdowicz.exercises.recursion

object Factorial extends App {

  def factorialWithIteration(n:BigInt): BigInt = {
    var fact = BigInt(1)
    for (x <- (1L to n.longValue())) {
      if (x > 0)
        fact *= x
    }
    fact
  }

  def factorialWithRecursion(n:BigInt): BigInt = {
    if (n <= 0)
      return 1
    n * factorialWithRecursion(n-1)
  }

  println(factorialWithIteration(55));

}
