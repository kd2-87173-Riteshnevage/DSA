package com.sunbeam;

public class firstNonRep {
	public static void main(String[] args) {
		int[] arr =  { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		int index = firstNonRepetatingEle(arr);
		
		if(index == -1) {
			System.out.println("No unique elements!");
		}
		else {
			System.out.println("First non-repeating element is: "+ arr[index]);
			
		}
		
		
		
		
	}
	
	private static int firstNonRepetatingEle(int[] arr) {
	
		int flag = -1;
		for(int i=0; i< arr.length; i++) {
			int count=0;
			for(int j = 0; j<arr.length; j++) {
				if(arr[i] == arr[j] && i != j) {
					count++;
					break;
				}
			}
			if(count == 0) {
				flag = i;
				break;
			}
		}
		
		return flag;
		
	}
	
}
