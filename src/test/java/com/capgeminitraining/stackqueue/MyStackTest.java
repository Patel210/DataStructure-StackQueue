package com.capgeminitraining.stackqueue;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyStackTest {

	private MyNode<Integer> firstNode;
	private MyNode<Integer> secondNode;
	private MyNode<Integer> thirdNode;
	private MyStack<Integer> myStack;

	@Before
	public void setup() {
		firstNode = new MyNode<Integer>(56);
		secondNode = new MyNode<Integer>(30);
		thirdNode = new MyNode<Integer>(70);
		myStack = new MyStack<Integer>();
	}

	@Test
	public void given3Numbers_WhenPushed_ShouldPassTheStackTest() {
		myStack.push(thirdNode);
		myStack.push(secondNode);
		myStack.push(firstNode);
		myStack.viewMyStack();
		boolean result = myStack.myLinkedList.getHead().equals(firstNode)
				&& myStack.myLinkedList.getHead().getNext().equals(secondNode)
				&& myStack.myLinkedList.getTail().equals(thirdNode);

		assertTrue(result);
	}

}
