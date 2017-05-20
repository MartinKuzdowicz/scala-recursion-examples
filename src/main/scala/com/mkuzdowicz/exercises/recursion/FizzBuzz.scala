package com.mkuzdowicz.exercises.recursion

object FizzBuzz extends App {

  val FIZZ: String = "FIZZ"
  val BUZZ: String = "BUZZ"
  val FIZZ_BUZZ: String = "FizzBuzz"

  def fizzBuzzIteratively(n: Int): List[(Int, String)] = {
    (n to 100).map(x => {
      if (x % 3 == 0 && x % 5 == 0) (x, FIZZ_BUZZ) else if (x % 3 == 0) (x, FIZZ) else if (x % 5 == 0) (x, BUZZ) else (x, "")
    }).toList
  }

  println(fizzBuzzIteratively(15))
  println(fizzBuzzIteratively(15).apply(0))

}
