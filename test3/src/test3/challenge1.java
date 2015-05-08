package test3;

import java.util.Scanner;

// program to print Reverse of an Array.

public class challenge1 {

	public static void main(String[] args) {
		int length_array;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array:");
		length_array = in.nextInt();
		
		int arr[] = new int[length_array];
		
		System.out.println("Now enter the array members:");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Array is :" );
		for (int i1 = 0; i1 < arr.length; i1++) {
		    System.out.println(arr[i1] + " ");
		}
		
		System.out.println("Reversed Array is :" );
		for (int i2 = arr.length - 1 ; i2 >= 0; i2--) {
		    System.out.println(arr[i2] + " ");
		}
	}

}
