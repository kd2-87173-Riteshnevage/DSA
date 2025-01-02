package com.sunbeam;

import java.util.Scanner;

public class RankOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int arr[] =  { 10, 20, 15, 3, 4, 4, 1 };
		 
		 System.out.println("Enter a number in array: ");
		 int num = sc.nextInt();
		 
		 int rank = rankOfElement(arr, num);
		 
		 if(rank == 0) {
			 System.out.println("Number is not in the array!");
		 }
		 else {
			 
			 System.out.println(" Rank of " + num + " is: " + rank);
		 }
		 
		 
		 

	}

	private static int rankOfElement(int[] arr, int num) {
		int cnt = 0;
		for(int i = 0; i<arr.length; i++) {
				if(arr[i]<= num) {
					cnt++;
				}
		}
		
		
		return cnt;
	}

}
