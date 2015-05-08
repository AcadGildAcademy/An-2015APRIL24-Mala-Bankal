package test3;

import java.util.Arrays;

public class search {

	public static void main(String[] args) {
		int [] arr = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		int element = -6;
        Arrays.sort(arr);
        printArray("Sorted array" , arr);
        int index = Arrays.binarySearch(arr, element);
        System.out.println("index @ " + index);
        int pos = -(index);
        System.out.println("insert at position @ " + pos);
        insertElement(arr, pos, element);

	}
	
	private static void insertElement(int[] arr, int pos, int element) {
		int []newarr = new int [11];
		for (int a=0; a < arr.length ; a++) {
			newarr[a] = arr[a];
		}
		printArray("new array" , newarr);
		int len = arr.length;
		for (int c = len - 1; c >= pos - 1 ; c--)
		    newarr[c+1] = newarr[c];
		
		   newarr[pos-1] = element;
		 
		   System.out.println("Resultant array is");
		 
		   printArray("new array" , newarr);

	}

	private static void printArray(String message, int array[]) {
	      System.out.println(message
	      + ": [length: " + array.length + "]");
	      for (int i = 0; i < array.length; i++) {
	         if(i != 0){
	            System.out.print(", ");
	         }
	         System.out.print(array[i]);                     
	      }
	      System.out.println();
	   }


}
