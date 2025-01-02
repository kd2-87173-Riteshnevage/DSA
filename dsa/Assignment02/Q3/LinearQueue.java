package com.sunbeam;

public class LinearQueue {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	
	public LinearQueue(int size) {
		SIZE = size;
		front = rear = 0;
		arr = new int[SIZE];
	}
	
	public void push(int value) {
		arr[rear] = value;
		rear++;
	}
	public int pop() {
		front++;
		return arr[front-1];
	}
	
	public int peek() {
		return arr[front];
	}
	
	public boolean isFull() {
		return rear == SIZE - 1;
		
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
}
