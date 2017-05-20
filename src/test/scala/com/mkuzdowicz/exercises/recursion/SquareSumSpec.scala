package com.mkuzdowicz.exercises.recursion

import org.junit.Assert.{assertEquals}
import org.junit.Test

class SquareSumSpec {

  @Test
  def square_sum_recursive_impl_returns_correct_values(): Unit = {
    assertEquals(5, SquareSum.squareSumRecursive(2))
    assertEquals(385, SquareSum.squareSumRecursive(10))
    assertEquals(91, SquareSum.squareSumRecursive(6))
  }

  @Test
  def square_sum_iteratively_impl_returns_correct_values(): Unit = {
    assertEquals(5, SquareSum.squareSumIteratively(2))
    assertEquals(385, SquareSum.squareSumIteratively(10))
    assertEquals(91, SquareSum.squareSumIteratively(6))
  }

}
