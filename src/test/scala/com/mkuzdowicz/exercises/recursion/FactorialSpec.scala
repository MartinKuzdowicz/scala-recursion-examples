package com.mkuzdowicz.exercises.recursion

import org.junit.Assert.{assertEquals}
import org.junit.Test

class FactorialSpec {

  @Test
  def factorial_iteration_function_returns_expected_values = {
    assertEquals(6, Factorial.factorialWithIteration(3).longValue())
    assertEquals(24, Factorial.factorialWithIteration(4).longValue())
  }

  @Test
  def factorial_iteration_function_returns_expected_values_for_large_numbers = {
    assertEquals(BigInt("815915283247897734345611269596115894272000000000"), Factorial.factorialWithIteration(40))
    assertEquals(BigInt("12696403353658275925965100847566516959580321051449436762275840000000000000"), Factorial.factorialWithIteration(55))
  }

  @Test
  def factorial_recursion_function_returns_expected_values = {
    assertEquals(6, Factorial.factorialWithRecursion(3).longValue())
    assertEquals(24, Factorial.factorialWithRecursion(4).longValue())
  }

  @Test
  def factorial_recursion_function_returns_expected_values_large_numbers = {
    assertEquals(BigInt("815915283247897734345611269596115894272000000000"), Factorial.factorialWithRecursion(40))
    assertEquals(BigInt("12696403353658275925965100847566516959580321051449436762275840000000000000"), Factorial.factorialWithRecursion(55))

  }

}
