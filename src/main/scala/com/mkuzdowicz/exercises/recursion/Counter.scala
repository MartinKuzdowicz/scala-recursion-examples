package com.mkuzdowicz.exercises.recursion

object Counter extends App {

  def countFromTo(from: Int, to: Int): Unit = {
    if (from <= to) {
      println(from)
      countFromTo(from + 1, to)
    }
  }

  println(countFromTo(1, 15))

}
