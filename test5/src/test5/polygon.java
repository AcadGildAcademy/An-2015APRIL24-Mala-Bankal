package test5;

public class polygon {

	private int num_sides;
	private int area;
	
	public polygon(int sides) {
		num_sides = sides;
	}
	
	void Display() {
		
		System.out.println("numer of sides is :"+ num_sides);
		if (num_sides == 4) {
			System.out.println("This is a Rectangle !");
		}
		else if (num_sides == 3) {
		    System.out.println("This is a Triangle !");	
		}
	}
	
}
