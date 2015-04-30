package test1;

import java.util.Scanner;

// program to check whether year is leap year or not
// this can also be resolved simply as :
// if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))

public class challenge3 {

	public static void main(String[] args) {
		int year;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the year:");
		year = in.nextInt();
		if (year % 100 == 0) {
			if (year % 400 == 0) {
			    System.out.println("This is a leap year");
		    }
			else {
				System.out.println("This is a not a leap year");	
			}
		}
		else if (year % 4 == 0) {
			System.out.println("This is a leap year");
		}
		else {
			System.out.println("This is a not a leap year");
		}

	}

}
