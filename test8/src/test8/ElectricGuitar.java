package test8;

public class ElectricGuitar extends StringedInstrument {
	
	public ElectricGuitar() {
		numberOfStrings = 10;
	}

	
	void play() {
		System.out.println("Lets play the Electric Guitar today !");
		System.out.println("Number of Strings : " + numberOfStrings);
		print();
	}
}
