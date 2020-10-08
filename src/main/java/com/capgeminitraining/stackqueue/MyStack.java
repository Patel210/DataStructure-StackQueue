package com.capgeminitraining.stackqueue;

public class MyStack<K extends Comparable> {
	MyLinkedList myLinkedList;

	public MyStack() {
		myLinkedList = new MyLinkedList();
	}

	/**
	 * Printing Stack
	 */
	public void viewMyStack() {
		myLinkedList.printLinkedList();
	}

	/**
	 * @param newNode Pushing new element into the stack
	 */
	public void push(INode newNode) {
		myLinkedList.add(newNode);
	}

	public INode peak() {
		return myLinkedList.getHead();
	}

	public INode pop() {
		return myLinkedList.pop();
	}
}
