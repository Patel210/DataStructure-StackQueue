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
		firstNode = new MyNode<Integer>(70);
		secondNode = new MyNode<Integer>(30);
		thirdNode = new MyNode<Integer>(56);
		myStack = new MyStack<Integer>();
	}

	@Test
	public void given3Numbers_WhenPushed_ShouldPassTheStackTest() {
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		myStack.viewMyStack();
		boolean result = myStack.myLinkedList.getHead().equals(thirdNode)
				&& myStack.myLinkedList.getHead().getNext().equals(secondNode)
				&& myStack.myLinkedList.getTail().equals(firstNode);

		assertTrue(result);
	}

	@Test
	public void givenAStack_WhenPoped_ShouldReturnTheLastAddedNode() {
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		INode pop = myStack.pop();
		INode peak = myStack.peak();
		assertEquals(thirdNode, pop);
		assertEquals(secondNode, peak);
		myStack.viewMyStack();
	}
}
