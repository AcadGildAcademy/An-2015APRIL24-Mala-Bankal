package test5;

public class Triangle extends Rectangle{

	float side1, side2, side3, s;
	private int sides;
	
	public Triangle(int side, int s1, int s2, int s3 ) {
		super(side, s1, s2);
		this.sides = side;
		side1 = s1;
		side2 = s2;
		side3 = s3;
		
	}
	
	@Override
	void Area() {
		float s, perimeter, x = 1/2, area;
		
		perimeter = side1 + side2 + side3;
		s = perimeter / 2;
		
		area = (float) Math.pow(s*(s - side1)*(s - side2)*(s - side3), x);
		System.out.println("Area of Triangle is: "+ area);
	}
	
	@Override
	void Display() {
		super.Display();
		System.out.println("Side1 of triangle :" + side1);
		System.out.println("Side2 of triangle :" + side2);
		System.out.println("Side3 of triangle :" + side3);
	}

}
