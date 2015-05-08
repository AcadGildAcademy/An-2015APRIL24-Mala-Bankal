package test4;

public class recursion {

	public static void main(String[] args) {
		String str = "Acadgild";
		
		recursion rec = new recursion();
        System.out.println(rec.reverse(str));
	}

	private String reverse(String str) {
		int len = str.length();
		if (len == 0) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
				//str.charAt(len -1) + reverse(str);
	}

}
