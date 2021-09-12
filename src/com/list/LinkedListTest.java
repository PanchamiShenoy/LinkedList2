package com.list;

public class LinkedListTest {
	public static void main(String[] args) {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		myLinkedList.addFront(myFirstNode);
		myLinkedList.addFront(mySecondNode);
		myLinkedList.addFront(myThirdNode);
		myLinkedList.printMyNodes();
	}
}
