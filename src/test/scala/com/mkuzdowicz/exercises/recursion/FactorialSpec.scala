package com.mkuzdowicz.exercises.recursion

import org.junit.Assert.{assertEquals}
import org.junit.Test

class FactorialSpec {

  @Test
  def factorial_iteration_function_returns_expected_values = {
    assertEquals(6, Factorial.factorialWithIteration(3))
    assertEquals(24, Factorial.factorialWithIteration(4))
  }

  @Test
  def factorial_recursion_function_returns_expected_values = {
    assertEquals(6, Factorial.factorialWithRecursion(3))
    assertEquals(24, Factorial.factorialWithRecursion(4))
  }

}
