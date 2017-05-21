package com.mkuzdowicz.exercises.recursion.trees

object Trees extends App {

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

  val exampleTree = new BinaryTree(rootNode)

  println(s" sum is: ${exampleTree.sum()}")

}
