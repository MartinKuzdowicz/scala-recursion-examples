package com.mkuzdowicz.exercises.recursion

import org.junit.Assert.{assertEquals}
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
  def fib_with_memoization_function_returns_expected_values = {
    val memo = collection.mutable.Map[Int, Long]();
    assertEquals(2, Fibonacci.fibWithRecursionAndMemoization(3, memo))
    assertEquals(1, Fibonacci.fibWithRecursionAndMemoization(2, memo))
    assertEquals(3, Fibonacci.fibWithRecursionAndMemoization(4, memo))
    assertEquals(5, Fibonacci.fibWithRecursionAndMemoization(5, memo))
    assertEquals(8, Fibonacci.fibWithRecursionAndMemoization(6, memo))
  }

  @Test
  def fib_with_memoization_function_returns_expected_values_for_large_numbers = {
    val memo = collection.mutable.Map[Int, Long]();
    assertEquals(12586269025L, Fibonacci.fibWithRecursionAndMemoization(50, memo))
    assertEquals(4376692037216111008L, Fibonacci.fibWithRecursionAndMemoization(120, memo))
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
