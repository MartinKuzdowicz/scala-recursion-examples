package com.mkuzdowicz.exercises.recursion.trees

class BinaryTree(root: BinaryTreeNode) {

  private def sumValuesOf(node: BinaryTreeNode): Int = {
    if (node == null)
      return 0
    node.value + sumValuesOf(node.left) + sumValuesOf(node.right)
  }

  def sum(): Int = {
    sumValuesOf(root)
  }

}