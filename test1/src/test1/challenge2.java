package test1;

import java.util.Scanner;

// program to check whether number is even or odd

public class challenge2 {

	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number:");
		number = in.nextInt();
		if (number % 2 == 0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}

	}

}
