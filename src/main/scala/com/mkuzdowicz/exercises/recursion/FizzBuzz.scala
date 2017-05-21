package com.mkuzdowicz.exercises.recursion

import scala.collection.mutable.ListBuffer

object FizzBuzz extends App {

  val FIZZ: String = "FIZZ"
  val BUZZ: String = "BUZZ"
  val FIZZ_BUZZ: String = "FizzBuzz"

  def fizzBuzzIteratively(n: Int): List[(Int, String)] = {
    (n to 100).map(x => {
      if (x % 3 == 0 && x % 5 == 0) (x, FIZZ_BUZZ) else if (x % 3 == 0) (x, FIZZ) else if (x % 5 == 0) (x, BUZZ) else (x, "")
    }).toList
  }

  private def fizzBuzzRecursivelyPriv(i: Int, resultBuff: ListBuffer[(Int, String)]): Unit = {
    if (i <= 100) {
      (i % 3, i % 5) match {
        case (0, 0) => resultBuff += ((i, FIZZ_BUZZ))
        case (0, _) => resultBuff += ((i, FIZZ))
        case (_, 0) => resultBuff += ((i, BUZZ))
        case _ =>
      }
      fizzBuzzRecursivelyPriv(i + 1, resultBuff)
    }
  }

  def fizzBuzzRecursively(i: Int): List[(Int, String)] = {
    val buff = ListBuffer[(Int, String)]()
    fizzBuzzRecursivelyPriv(i, buff)
    buff.toList
  }

  println(fizzBuzzIteratively(15))
  println(fizzBuzzIteratively(15).apply(0))

  println(fizzBuzzRecursively(15))

}
