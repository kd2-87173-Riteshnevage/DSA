package com.sunbeam;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		
		l1.addFirst(10);
		l1.addLast(20);
		l1.addLast(30);
		l1.addLast(50);
		l1.addFirst(40);
		l1.display();
		
		l1.addPosistion(70, 3);
		l1.display();
		
		l1.addBeforGivenData(60, 70);
		l1.display();
		
		l1.addAfterGivenData(80, 70);
		l1.display();
	}

}
