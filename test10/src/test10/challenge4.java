package test10;

public class challenge4 {

	int price = 20;
	
	challenge4(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    challenge4 np = null;
		    np.getPrice();
		} catch (NullPointerException e) {
			System.out.println("Exception caught: Null assignment not permitted !");
		}

	}

}
