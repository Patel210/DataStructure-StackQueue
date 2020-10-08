package com.capgeminitraining.stackqueue;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MyQueueTest {
	private MyNode<Integer> firstNode;
	private MyNode<Integer> secondNode;
	private MyNode<Integer> thirdNode;
	private MyQueue<Integer> myQueue;

	@Before
	public void setup() {
		firstNode = new MyNode<Integer>(56);
		secondNode = new MyNode<Integer>(30);
		thirdNode = new MyNode<Integer>(70);
		myQueue = new MyQueue<Integer>();
	}
	
	@Test
	public void given3Numbers_WhenQueued_ShouldHaveFirstAddedNode() {
		myQueue.enqueue(firstNode);
		myQueue.enqueue(secondNode);
		myQueue.enqueue(thirdNode);
		myQueue.viewMyQueue();
		boolean result = myQueue.myLinkedList.getHead().equals(firstNode) && myQueue.myLinkedList.getHead().getNext().equals(secondNode)
				&& myQueue.myLinkedList.getTail().equals(thirdNode);
		assertTrue(result);
	}
}
