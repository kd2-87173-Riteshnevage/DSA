package com.sunbeam;

import java.util.Scanner;

public class LastOccuranceLinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {89, 21, 22, 22, 21, 89, 11, 32, 43 , 11, 22, 89};
		
		System.out.println("Enter a key to search: ");
		int key = sc.nextInt();
		
		int index = linearSearchLastOccurance(arr, key);
		
		if(index == -1) {
			System.out.println("Key not found!");
		}
		else {
			System.out.println("Last occurance of key is at index: " + index);
		}
		
		
		

	}

	private static int linearSearchLastOccurance(int[] arr, int key) {
		for(int i = arr.length-1 ; i>=0; i--) {
			if(key == arr[i]) {
				return i;
			}
		}
		
		return -1;
	}

}
