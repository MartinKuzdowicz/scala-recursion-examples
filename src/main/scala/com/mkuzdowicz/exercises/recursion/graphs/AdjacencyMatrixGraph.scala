package com.mkuzdowicz.exercises.recursion.graphs

class AdjacencyMatrixGraph {

  val graph = Array(
    Array(0, 0, 3, 0),
    Array(0, 0, 5, 4),
    Array(0, 0, 0, 2),
    Array(1, 0, 0, 0)
  )

  def cenReach(curr: Int, dest: Int, visited: Array[Boolean]): Boolean = {
    visited(curr) = true
    if (curr == dest) true
    else {
      var isReachable = false
      for (i <- graph(curr).indices) {
        if (!visited(i) && graph(curr)(i) > 0) {
          isReachable = cenReach(i, dest, visited)
        }
      }
      isReachable
    }
  }

}
