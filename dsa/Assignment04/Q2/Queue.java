package com.sunbeam;

public class Queue {
	private LinkedList list;

	public Queue() {
		list = new LinkedList();
	}

	public void push(int value) {
		list.addLast(value);
	}

	public void pop() {
		System.out.println("Element poped: " + list.getHeadData());
		list.deleteFirst();
	}

	public void peek() {
		System.out.println("Element at Peek: " + list.getHeadData());
	}

	public void display() {
		System.out.println("Queue: ");
		list.fDisplay();
	}
}
