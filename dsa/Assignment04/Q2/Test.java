package com.sunbeam;

public class Test {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.display();
		s1.pop();
		s1.display();
		
		s1.peek();
		
		System.out.println();
		
		Queue q1 = new Queue();
		q1.push(10);
		q1.push(20);
		q1.push(30);
		q1.push(40);
		q1.push(50);
		q1.display();
		q1.pop();
		q1.display();
		
		q1.peek();
		

	}

}
