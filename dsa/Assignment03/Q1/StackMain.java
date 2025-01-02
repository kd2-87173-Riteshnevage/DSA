package com.sunbeam;

import java.util.Scanner;

public class StackMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements in the array: ");
		for(int i = 0; i< size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Your array: ");
		for(int i = 0; i< size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Stack s = new Stack(size);
		
		for(int i = 0; i< size; i++)
			s.push(arr[i]);
		
		System.out.println("Array in reverse order: ");
		
		while(!s.isEmpty())
			System.out.print(s.pop()+ " ");
	}

}
