package com.sunbeam;

import java.util.Scanner;

public class CircularQueuemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CircularQueue cq = new CircularQueue(4);
		int choice;
		
		do {
			System.out.println("1. Push\n2. Pop\n3. Peek\n4. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				if(cq.isFull()) {
					System.out.println("Queue is full!");
				}
				else {
					System.out.println("Enter a value: ");
					int value = sc.nextInt();
					cq.push(value);
				}
				break;
			
			case 2:
				if(cq.isEmpty())
					System.out.println("Queue is Empty!");
				else {
					System.out.println("Element poped : " + cq.pop());
				}
				break;
				
			case 3:
				if(cq.isEmpty())
					System.out.println("Queue is Empty!");
				else
					System.out.println("Element at peek: " + cq.peek());
				break;

			default:
				break;
			}
		}while(choice != 4);
		

	}

}
