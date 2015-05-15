package test8;

public class ElectricBassGuitar extends StringedInstrument {

	String name;
	
	public ElectricBassGuitar() {
		numberOfStrings = 20;
		name = "Bass";
	}
	
	void play() {
		System.out.println("Lets play the Electric Bass Guitar today !");
		System.out.println("Number of Strings : " + numberOfStrings);
	}
	
	public void print() {
		System.out.println(name);
	}
}
