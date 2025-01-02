package com.sunbeam;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[6];
		
		emp[0] = new Employee(1, "Omkar", 432234);
		emp[1] = new Employee(2, "Ramesh", 498344);
		emp[2] = new Employee(3, "Suresh", 473644);
		emp[3] = new Employee(4, "Anil", 394723);
		emp[4] = new Employee(5, "Sham", 342403);
		emp[5] = new Employee(6, "Pravin", 394839);
		
		System.out.println("Before Sorting by salary: ");
		for(Employee e: emp) {
			System.out.println(e);
		}
		
		SortBySalary(emp, emp.length);
		
		System.out.println();
		
		System.out.println("After Sorting by salary: ");
		for(Employee e: emp) {
			System.out.println(e);
		}
		
		
	}

	private static void SortBySalary(Employee[] emp, int N) {
//		for(int i = 1; i< N ; i++) {
//			int flag = 0;
//			
//			for(int j = 0; j< N-1; j++ ) {
//				if(emp[j+1].getSalary() < emp[j].getSalary()) {
//					Employee temp = emp[j];
//					emp[j] = emp[j+1];
//					emp[j+1] = temp;
//					flag = 1;
//			
//				}
//				
//			}
//			if(flag == 0) {
//				break;
//			}
//		}
		
		for(int i = 1; i< N ; i++) {
			Employee temp = emp[i];
			int j;
			for(j = i-1; j >= 0 && emp[j].getSalary() > temp.getSalary(); j--) {
				emp[j+1] = emp[j];
			}
			emp[j+1] = temp;
		}
		
	}

}
