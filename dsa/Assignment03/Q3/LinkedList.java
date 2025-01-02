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
	
	private Node head;
	private int size;
	
	public LinkedList() {
		head = null;
		size =0;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addFirst(int value) {
		Node nn= new Node(value);
		
		if(isEmpty()) {
			head = nn;
		}
		else {
			nn.next = head;
			head = nn;
		}
		size++;
	}
	
	public void addLast(int value) {
		Node nn = new Node(value);
		
		if(isEmpty())
			head = nn;
		else {
			Node trav = head;
			while(trav.next != null) {
				trav = trav.next;
			}
			nn.next = null;
			trav.next = nn;
		}
		size++;
	}
	
	public void addPosistion(int value, int pos) {
		if(pos< 1 || pos > size+1)
			return;
		
		Node nn = new Node(value);
		
		if(isEmpty())
			return;
		else if(pos == 1) {
			addFirst(value);
			return;
		}
		else if(pos == size) {
			addLast(value);
			return;
		}
		else {
			Node trav = head;
			
			for(int i = 1; i< pos-1; i++)
				trav = trav.next;
			
			nn.next = trav.next;
			trav.next = nn;
			
			
		}
		size++;
	}
	
	public void addBeforGivenData(int value, int gData) {
		Node nn = new Node(value);
		if(isEmpty())
			return;
		else{
			Node trav = head;
			while(trav.next.data != gData)
				trav = trav.next;
			
			nn.next = trav.next;
			trav.next = nn;			
		}	
		
	}
	

	public void addAfterGivenData(int value, int gData) {
		Node nn = new Node(value);
		if(isEmpty())
			return;
		else{
			Node trav = head;
			while(trav.data != gData)
				trav = trav.next;
			
			nn.next = trav.next;
			trav.next = nn;			
		}	
		
	}
	
	public void display() {
		Node trav = head;
		if(isEmpty()) {
			return;
		}
		System.out.print("List: ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}

}
