package test10;

public class challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		try {
			num = Integer.parseInt("25");
			System.out.println(num);
			num = Integer.parseInt("XYZ");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Exception caught: String cannot be parsed to integer.");
		}

	}

}
