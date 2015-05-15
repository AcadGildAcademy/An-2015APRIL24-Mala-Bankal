package test9;

import java.util.Scanner;

public class Circle implements Shape {

	static double radius, area, pi=3.14, diameter;
	
	public Circle() {
		
	}
	
	public static void main(String[] args) {
		Circle C = new Circle();
		C.draw();
		
		double rad = C.getRadius();
		System.out.println("Radius is : " + rad);
		
		double A = C.getArea();
		System.out.println("Area is : " + A);
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Calculating Area of a Circle");
		
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		diameter = radius*radius;
		area = pi*diameter;
		return (float) area;
	}
	
	public float getRadius() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius :");
	    radius = in.nextFloat();
		return (float) radius;
		
	}
	

}
