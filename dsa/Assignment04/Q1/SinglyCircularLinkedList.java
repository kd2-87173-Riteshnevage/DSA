package com.sunbeam;

public class SinglyCircularLinkedList {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		l1.addFirst(10);
		l1.addLast(20);
		l1.addLast(30);
		l1.addLast(40);
		l1.addFirst(50);
		l1.addPosition(60, 3);
		
		l1.display();
		
		l1.deleteFirst();
		l1.display();
		
		l1.deleteLast();
		l1.display();
		l1.deletePosition(3);
		l1.display();
	}

}
