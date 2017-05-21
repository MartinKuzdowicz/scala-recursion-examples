package com.mkuzdowicz.exercises.recursion

import org.junit.Assert.{assertEquals}
import org.junit.Test

class FizzBuzzSpec {

  @Test
  def fizz_buzz_iteratively_return_correct_results(): Unit = {
    assertEquals((15, FizzBuzz.FIZZ_BUZZ), FizzBuzz.fizzBuzzIteratively(15).apply(0))
    assertEquals((20, FizzBuzz.FIZZ), FizzBuzz.fizzBuzzIteratively(20).apply(0))
    assertEquals((21, FizzBuzz.BUZZ), FizzBuzz.fizzBuzzIteratively(21).apply(0))

  }

  @Test
  def fizz_buzz_recursively_return_correct_results(): Unit = {
    assertEquals((15, FizzBuzz.FIZZ_BUZZ), FizzBuzz.fizzBuzzRecursively(15).apply(0))
    assertEquals((20, FizzBuzz.FIZZ), FizzBuzz.fizzBuzzRecursively(20).apply(0))
    assertEquals((21, FizzBuzz.BUZZ), FizzBuzz.fizzBuzzRecursively(21).apply(0))
  }

}
