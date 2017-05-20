package com.mkuzdowicz.exercises.recursion.tress

class Tree(root: Node) {

  private def sumValuesOf(node: Node): Int = {
    if (node == null)
      return 0
    node.value + sumValuesOf(node.left) + sumValuesOf(node.right)
  }

  def sum(): Int = {
    sumValuesOf(root)
  }

}