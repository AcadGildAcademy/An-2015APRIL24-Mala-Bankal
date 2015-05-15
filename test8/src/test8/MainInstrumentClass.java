package test8;

//'Abstract class' assignment

public class MainInstrumentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricGuitar eg = new ElectricGuitar();
		eg.play();
		ElectricBassGuitar ebg = new ElectricBassGuitar();
		ebg.play();
		ebg.print();
	}

}
