package test6;

public class rectangle {

	int length;
	int breadth;
	
	public rectangle() {
		// TODO Auto-generated constructor stub
		this.length = 0;
		this.breadth = 0;
	}
	
	public rectangle(int a) {
		// TODO Auto-generated constructor stub
		this.length = a;
		this.breadth = a;
	}
	
	public rectangle(int a, int b) {
		// TODO Auto-generated constructor stub
		this.length = a;
		this.breadth = b;
	}
	
	
	void Display() {
		
		if ((length == 0) || (breadth == 0)) {
			System.out.println("length or breadth is 0, cannot calculate the area");
		}
		
        if ((length != 0) || (breadth != 0)) {
				if (length == breadth) {
					System.out.println("This is a square");
				}
				else if (length != breadth) {
					System.out.println("This is a rectangle");
				}
		}
	}
	
	void Area() {
		int area = length * breadth;
		if (area != 0) {
		    if (length != breadth) {
		        System.out.println("Area of Rectangle :" + area);
		    }
		    else if (length == breadth) {
			    System.out.println("Area of Square :" + area);
		    }
		}
	}
	
}
