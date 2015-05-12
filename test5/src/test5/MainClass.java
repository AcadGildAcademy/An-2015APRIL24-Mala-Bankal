package test5;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polygon poly= new polygon(4);
		poly.Display();
		
		Rectangle rect= new Rectangle(4, 20, 10);
		rect.Display();
		rect.Area();
		
		Triangle tri= new Triangle(3, 20, 30, 20);
		tri.Display();
		tri.Area();

	}

}
