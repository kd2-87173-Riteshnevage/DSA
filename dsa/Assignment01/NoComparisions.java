package com.sunbeam;

import java.util.Scanner;

public class NoComparisions {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		
		System.out.println("Enter a key to search: ");
		int key = sc.nextInt();
		
		int index;
		
		if(((index = linearSearch(arr, key)) == -1) || ((index = binarySearch(arr, key)) == -1)) {
			System.out.println("Key not found!");
		}
		else {
			System.out.println("Key found!");
			System.out.println("No of comparisons done in linar search: " + linearSearch(arr, key));
			System.out.println("No of comparisons done in binary search: " + binarySearch(arr, key));
		}
		
	}
	
	private static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length-1, mid;
		int cnt = -1;
		while(left<= right) {
			mid = (left + right)/2;
			cnt++;
			if(key == arr[mid]) {
				return cnt+1;
			}
			else if(key < arr[mid]) {
				right = mid - 1;
			}
			else {
				left = mid+1;
			}
		}
		return cnt;
	}

	private static int linearSearch(int[] arr, int key) {
		int cnt = -1;
		for(int i = 0; i < arr.length; i++) {
			cnt++;
			if(arr[i] == key) {
				return cnt+1;
			}
		}
			
		return cnt;
	}
	


}
