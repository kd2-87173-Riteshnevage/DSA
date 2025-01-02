package com.sunbeam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] emp = new Employee[5];
		
		emp[0] = new Employee(1, "Omkar");
		emp[1] = new Employee(2, "Ram");
		emp[2] = new Employee(3, "Arun");
		emp[3] = new Employee(4, "Mukesh");
		emp[4] = new Employee(5, "Shuresh");
			
		
		System.out.println("1. Find Employee by Id: ");
		System.out.println("2. Find Employee by name: ");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Enter a id to search: ");
			int id = sc.nextInt();
			int indexId = linearSearchId(emp, id);
			if(indexId == -1)
				System.out.println("Employee not found!");
			else
				System.out.println("Employee found at index: " + indexId);
			break;
		
		case 2:
			System.out.println("Enter a name to search: ");
			String name = sc.next();
			int indexName = linearSearchName(emp, name);
			if(indexName == -1)
				System.out.println("Employee not found!");
			else
				System.out.println("Employee found at index: " + indexName);
			break;

		default:
			System.out.println("Wrong choice entered!");
			break;
		}
		
		
		

	}


	private static int linearSearchId(Employee[] emp, int id) {
		for(int i = 0; i<emp.length; i++) {
			if(id == emp[i].getId()) {
				return i;
			}
		}
		
		return -1;
	}


	private static int linearSearchName(Employee[] emp, String name) {
		for(int i = 0; i<emp.length; i++) {
			if(name.equals(emp[i].getName())) {
				return i;
			}
		}
		return -1;
	}

}
