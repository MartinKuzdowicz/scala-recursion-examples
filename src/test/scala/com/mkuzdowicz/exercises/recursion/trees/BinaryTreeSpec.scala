package com.mkuzdowicz.exercises.recursion.trees

import org.junit.Assert.{assertEquals}
import org.junit.Test

class BinaryTreeSpec {

  @Test
  def tree_sum_function_should_sum_all_nodes_values_1 = {
    val rootNode = BinaryTreeNode(4)
    val node1 = BinaryTreeNode(1)
    val node2 = BinaryTreeNode(3)
    val node3 = BinaryTreeNode(7)
    val node4 = BinaryTreeNode(2)
    val node5 = BinaryTreeNode(10)
    val node6 = BinaryTreeNode(89)
    rootNode.left = node1
    rootNode.right = node2
    rootNode.left.left = node3
    rootNode.left.right = node4
    rootNode.left.right.left = node5
    rootNode.left.right.right = node6
    val binaryTree = new BinaryTree(rootNode)

    assertEquals(116, binaryTree.sum())
  }

  @Test
  def tree_sum_function_should_sum_all_nodes_values_2 = {
    val rootNode = BinaryTreeNode(10)
    val node1 = BinaryTreeNode(11)
    val node2 = BinaryTreeNode(500)
    rootNode.left = node1
    rootNode.right = node2
    val binaryTree = new BinaryTree(rootNode)

    assertEquals(521, binaryTree.sum())
  }

}
