package com.sunbeam;

public class CircularQueue {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	private int cnt= 0;
	
	public CircularQueue(int size) {
		// TODO Auto-generated constructor stub
		SIZE = size;
		front = rear = -1;
		arr = new int[SIZE];
	}
	
	public void push(int value) {
		rear = (rear + 1) % SIZE;
		arr[rear] = value;
		cnt++;
	}
	public int pop() {
		int temp = arr[(front + 1) % SIZE];
		front = (front + 1) % SIZE;
		cnt--;
		return temp;
	}
	
	public int peek() {
		return arr[(front + 1) % SIZE];
	}
	public boolean isFull() {
		return cnt == SIZE;
	}
	public boolean isEmpty() {
		return cnt == 0;
	}

}
