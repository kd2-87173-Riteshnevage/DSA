package com.sunbeam;

public class Stack {
	private LinkedList list;
	
	public Stack() {
		list = new LinkedList();
	}
	
	public void push(int value) {
		list.addLast(value);
	}
	
	public void pop() {
		System.out.println("Element poped: " + list.getTailData());
		list.deleteLast();
	}
	
	public void peek() {
		System.out.println("Element at Peek: " + list.getTailData());
	}
	
	public void display() {
		System.out.println("Stack: ");
		list.fDisplay();
	}
	
}
