package com.sunbeam;

import java.util.Scanner;

public class NthOccur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {11,22,33,11,44,22,55,66,33,11,22,33,55};
		
		System.out.println("Enter a key to search: ");
		int key = sc.nextInt();
		System.out.println("Enter which occurance to search: ");
		int occ = sc.nextInt();
		
		int index = linearSearchNthOccur(arr, key, occ);
		
		if(index == -1) {
			System.out.println("Key not found!");
		}
		else {
			System.out.println(occ + "th occurance of key is found at index: " + index);
		}
	}

	private static int linearSearchNthOccur(int[] arr, int key, int occ) {
		int cnt = 0;
		for(int i = 0; i< arr.length; i++) {
			if(key == arr[i]) {
				cnt++;
				if(cnt == occ) {
					return i;
				}
			}
				
			
		}
		
		
		return -1;
	}

}
