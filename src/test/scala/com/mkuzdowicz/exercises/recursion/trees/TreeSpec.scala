package com.mkuzdowicz.exercises.recursion.trees

import org.junit.Assert.{assertEquals}
import org.junit.Test

class TreeSpec {

  @Test
  def tree_sum_function_should_sum_all_nodes_values_1 = {
    val rootNode = Node(4)
    val node1 = Node(1)
    val node2 = Node(3)
    val node3 = Node(7)
    val node4 = Node(2)
    val node5 = Node(10)
    val node6 = Node(89)
    rootNode.left = node1
    rootNode.right = node2
    rootNode.left.left = node3
    rootNode.left.right = node4
    rootNode.left.right.left = node5
    rootNode.left.right.right = node6
    val tree = new Tree(rootNode)

    assertEquals(116, tree.sum())
  }

  @Test
  def tree_sum_function_should_sum_all_nodes_values_2 = {
    val rootNode = Node(10)
    val node1 = Node(11)
    val node2 = Node(500)
    rootNode.left = node1
    rootNode.right = node2
    val tree = new Tree(rootNode)

    assertEquals(521, tree.sum())
  }

}
