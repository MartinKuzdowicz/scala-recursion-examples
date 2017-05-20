package com.mkuzdowicz.exercises.recursion.tress

object Trees extends App {

  val rootNode = Node(4)
  val node1 = Node(1)
  val node2 = Node(3)
  val node3 = Node(7)
  val node4 = Node(2)
  val node5 = Node(10)
  val node6 = Node(89)

  rootNode.left = node1
  rootNode.right = node2

  val exampleTree = new Tree(rootNode)

  println(s" sum is: ${exampleTree.sum()}")

}
