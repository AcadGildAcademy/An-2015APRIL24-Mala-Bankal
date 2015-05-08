package test3;

import java.util.Arrays;
import java.util.Scanner;

public class challenge2 {

	public static void main(String[] args) {
		int length_array, insert_ele;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array:");
		length_array = in.nextInt();
		
		int arr[] = new int[length_array];
		
		System.out.println("Now enter the array members for sorting :");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Array before sort is :" );
		for (int i1 = 0; i1 < arr.length; i1++) {
		    System.out.println(arr[i1] + " " );
		}
		System.out.println("Sorting Array ..." );
		System.out.println("....... ..." );
		System.out.println("..... ..." );
		System.out.println(".. ..." );
		System.out.println("..." );
		System.out.println("Sorted Array is :" );
        bubbleSort(arr);
        for (int i2 = 0; i2 < arr.length ; i2++) {
        	System.out.println(arr[i2] + " " );	
        }
                
	}
	
	public static void bubbleSort(int[] array) {
	    boolean swap = true;
	    int j = 0;
	    int tmp;
	    while (swap) {
	        swap = false;
	        j++;
	        for (int i = 0; i < array.length - j; i++) {
	            if (array[i] > array[i + 1]) {
	                tmp = array[i];
	                array[i] = array[i + 1];
	                array[i + 1] = tmp;
	                swap = true;
	            }
	        }
	    }
	}

	
}
