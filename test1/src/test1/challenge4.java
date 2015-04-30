package test1;

import java.util.Scanner;

// program to determine if a given alphabet is vowel or consonant

public class challenge4 {

	public static void main(String[] args) {
		String alphabet;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the alphabet:");
		alphabet = in.nextLine();
		if (alphabet.equals("a") || alphabet.equals("e") || 
				alphabet.equals("i") || alphabet.equals("o") ||
				alphabet.equals("u")) {
			System.out.println("It is a vowel");
		}
		else {
			System.out.println("It is a consonent");
		}

	}

}
