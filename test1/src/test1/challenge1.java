package test1;

import java.util.Scanner;

// program to check whether you are eligible for vote or not

public class challenge1 {

	public static void main(String[] args) {
		int age;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter your age:");
		age = in.nextInt();
		if (age > 18 || age == 18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("Sorry, You are not eligible to vote");
		}

	}

}
