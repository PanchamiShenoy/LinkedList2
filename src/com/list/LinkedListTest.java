package com.list;

public class LinkedListTest {
	public static void main(String[] args) {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		if (myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode))
			System.out.println("Linked list is created!!");
		else
			System.out.println("Linked list not created!!!");
	}
}
