package test8;

public class StringedInstrument extends Instrument {

	int numberOfStrings;
	
	public StringedInstrument() {
		numberOfStrings = 0;
		name = "Strings";
		
	}
	
	void play() {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(" Lets play the StringedInstrument with :" + numberOfStrings + "number of Strings");
		print();
	}
	
	
}
