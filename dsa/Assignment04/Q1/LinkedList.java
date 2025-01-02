package com.sunbeam;

public class LinkedList {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node tail;
	private int size;
	
	public LinkedList() {
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return tail == null;
	}
	
	public void addFirst(int value) {
		Node nn = new Node(value);
		
		if(isEmpty()) {
			tail = nn;
			tail.next = nn;
		}
		else {
			nn.next = tail.next;
			tail.next = nn;
		}
		size++;
	}
	
	public void addLast(int value) {
		Node nn = new Node(value);
		
		if(isEmpty()) {
			tail = nn;
			tail.next = nn;
		}
		else {
			nn.next = tail.next;
			tail.next = nn;
			tail = nn;
		}
		size++;
	}
	
	public void addPosition(int value, int pos) {
		if(pos< 1 || pos > size+1)
			return;
		
		Node nn = new Node(value);
		
		if(isEmpty()) {
			tail = nn;
			tail.next = nn;
		}
		else if(pos == 1) {
			addFirst(value);
		}
		else if(pos == size+1) {
			addLast(value);
		}
		else {
			Node trav = tail.next;
			for(int i =1; i< pos-1; i++)
				trav = trav.next;
			
			nn.next = trav.next;
			trav.next = nn;
		}
		size++;
	}
	
	public void deleteFirst() {
		if(isEmpty()) {
			return;
		}
		else if(size == 1)
			tail = null;
		else {
			tail.next = tail.next.next;
		}
		size--;
	}
	
	public void deleteLast() {
		if(isEmpty()) {
			return;
		}
		else if(size == 1)
			tail = null;
		else {
			Node trav = tail;
			while(trav.next != tail)
				trav = trav.next;
			
			trav.next = tail.next;
			tail = trav;
		}
		size--;
	}
	
	public void deletePosition(int pos) {
		if(pos < 1 || pos> size+1)
			return;
					
		if(size == 1) {
			tail = null;
		}
		else if(pos == 1) {
			deleteFirst();
		}
		else if(pos == size)
			deleteLast();			
		else {
			Node trav = tail.next;
			for(int i =1; i< pos-1; i++)
				trav = trav.next;
			
			trav.next = trav.next.next;
		}
		size--;
	}
	
	public void display() {
		if(isEmpty())
			return;
		System.out.print("List: ");
		Node trav = tail;
		
		do {
			System.out.print(" " + trav.next.data);
			trav = trav.next;
		}while(trav != tail);
		System.out.println();
	}
	
	public void deleteAll() {
		tail = null;
		size = 0;
	}

}
