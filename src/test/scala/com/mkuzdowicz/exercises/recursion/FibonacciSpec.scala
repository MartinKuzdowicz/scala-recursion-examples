package com.mkuzdowicz.exercises.recursion

import org.junit.Assert._
import org.junit.Test

class FibonacciSpec {

  @Test
  def fib_recursion_function_returns_expected_values = {
    assertEquals(1, Fibonacci.fibWithRecursion(2))
    assertEquals(2, Fibonacci.fibWithRecursion(3))
    assertEquals(3, Fibonacci.fibWithRecursion(4))
    assertEquals(5, Fibonacci.fibWithRecursion(5))
    assertEquals(8, Fibonacci.fibWithRecursion(6))
  }

  @Test
  def fib_iteration_function_returns_expected_values = {
    assertEquals(1, Fibonacci.fibWithIteration(2))
    assertEquals(2, Fibonacci.fibWithIteration(3))
    assertEquals(3, Fibonacci.fibWithIteration(4))
    assertEquals(5, Fibonacci.fibWithIteration(5))
    assertEquals(8, Fibonacci.fibWithIteration(6))
  }

}
