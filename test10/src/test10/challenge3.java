package test10;

public class challenge3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,6,32,12};
		try {
		    for (int i=0; i<=6; i++) {
			    System.out.println(arr[i]);
		    }
		} catch(ArrayIndexOutOfBoundsException e) {
			throw new StringIndexOutOfBoundsException();
		}

	}

}
