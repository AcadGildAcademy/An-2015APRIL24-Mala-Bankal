package test5;

public class Rectangle extends polygon {
	
	private int sides;
	private int length;
	private int width;

	public Rectangle(int side , int len, int wid) {
		
		super(side);
		this.sides = sides;
		length = len;
		width = wid;
				
	}
	
	@Override
	void Display() {
		super.Display();
		if (sides == 4) {
		    System.out.println("Length of rectangle :" + length);
		    System.out.println("Width of rectangle :" + width);
		}
	}
	
	void Area() {
		int area = length * width;
		System.out.println("Area of Rectangle :" + area);
	}

}
