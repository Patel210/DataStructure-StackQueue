package com.capgeminitraining.stackqueue;

public class MyQueue<K extends Comparable> {
	MyLinkedList myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList();
	}

	/**
	 * @param newNode Enqueuing new element in the queue 
	 */
	public void enqueue(INode newNode) {
		myLinkedList.append(newNode);
	}
	
	/**
	 * Printing queue
	 */
	public void viewMyQueue() {
		myLinkedList.printLinkedList();
	}
}
