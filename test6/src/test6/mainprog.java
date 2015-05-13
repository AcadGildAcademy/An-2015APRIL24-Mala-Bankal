package test6;

//method overloading example

public class mainprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle rect1 = new rectangle(); //indicating 0 assignment
		rectangle rect2 = new rectangle(10); //indicating a square
		rectangle rect3 = new rectangle(10,20); //indicating a rectangle
		rect1.Display();
		rect1.Area();
		rect2.Display();
		rect2.Area();
		rect3.Display();
		rect3.Area();
	}

}
