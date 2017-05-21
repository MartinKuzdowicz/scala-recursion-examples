package com.mkuzdowicz.exercises.recursion.graphs

object Graphs extends App {

  val graphInstance = new AdjacencyMatrixGraph()

  println(graphInstance.cenReach(0, 1, Array.fill(graphInstance.graph.size)(false)))

  println(graphInstance.cenReach(0, 3, Array.fill(graphInstance.graph.size)(false)))

}
