package com.list;

public class LinkedListTest {
	public static void addNewNode() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		LinkedList<Integer> LinkedList = new LinkedList<Integer>();
		LinkedList.addFront(myFirstNode);
		LinkedList.addFront(mySecondNode);
		LinkedList.addFront(myThirdNode);

		LinkedList.printMyNodes();
	}

	/**
	 * this method is to append nodes into linked list
	 */
	public static void appendNode() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);

		LinkedList<Integer> LinkedList = new LinkedList<Integer>();
		LinkedList.addFront(myFirstNode);
		LinkedList.append(mySecondNode);
		LinkedList.append(myThirdNode);
		LinkedList.printMyNodes();
	}

	public static void insertBetween() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);

		LinkedList<Integer> LinkedList = new LinkedList<Integer>();
		LinkedList.addFront(myFirstNode);
		LinkedList.append(myThirdNode);
		LinkedList.insert(2, mySecondNode);
		LinkedList.printMyNodes();
	}

	public static void main(String[] args) {
		// createLinkedlist();
		// addNewNode();
		// appendNode();
		insertBetween();
	}

}
