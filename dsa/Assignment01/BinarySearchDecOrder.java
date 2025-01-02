import java.util.Scanner;

public class BinarySearchDecOrder {

	public static void main(String[] args) {
		//int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		Scanner sc = new Scanner(System.in);
		int arr[] = {99, 88, 77, 66, 55, 44, 33, 22, 11};
		
		System.out.println("Enter key to search: " );
		int key = sc.nextInt();
		
	 int index = binarySearch(arr, key);
	 if(index == -1)
		 System.out.println("Key not found!");
	 else
		 System.out.println("Key found at index: " + index);
		
	}

	private static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length-1, mid;

		while(left<=right) {
			mid = (left+ right)/2;
			if(key == arr[mid])
				return mid;
			else if(key < arr[mid])
				left = mid + 1;
			else
				right = mid-1;
		}
		return -1;
	}

}
