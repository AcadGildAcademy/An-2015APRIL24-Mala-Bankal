package test2;

import java.time.Month;
import java.util.Scanner;

// program to check total number of days in the given month.

public class challenge1 {
	
	public static void main(String[] args) {
		String m;
			
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the month:");
		m = in.nextLine();
		getDays(m);
	}
	
	public static void getDays(String months) {
				
		switch(months) {
		    case "january":
		    	System.out.printf("Days in January : %d%n", Month.JANUARY.maxLength());
		    	break;
		    case "february":
		    	System.out.printf("Days in February : %d%n", Month.FEBRUARY.maxLength());
		    	break;
		    case "march":
		    	System.out.printf("Days in March : %d%n", Month.MARCH.maxLength());
		    	break;
		    case "april":
		    	System.out.printf("Days in April : %d%n", Month.APRIL.maxLength());
		    	break;
		    case "may":
		    	System.out.printf("Days in May : %d%n", Month.MAY.maxLength());
		    	break;
		    case "june":
		    	System.out.printf("Days in June : %d%n", Month.JUNE.maxLength());
		    	break;
		    case "july":
		    	System.out.printf("Days in July : %d%n", Month.JULY.maxLength());
		    	break;
		    case "august":
		    	System.out.printf("Days in August : %d%n", Month.AUGUST.maxLength());
		    	break;
		    case "september":
		    	System.out.printf("Days in September : %d%n", Month.SEPTEMBER.maxLength());
		    	break;
		    case "october":
		    	System.out.printf("Days in October : %d%n", Month.OCTOBER.maxLength());
		    	break;
		    case "november":
		    	System.out.printf("Days in November : %d%n", Month.NOVEMBER.maxLength());
		    	break;
		    case "december":
		    	System.out.printf("Days in December : %d%n", Month.DECEMBER.maxLength());
		    	break;
		    default:
		    	System.out.println("Invalid month");
		    	break;
   			
		}
	}
}
