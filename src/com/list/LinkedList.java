package com.list;

public class LinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;

	}

	/**
	 * method to print nodes
	 */
	public void printMyNodes() {
		System.out.println("My Nodes: " + head);
	}
}
