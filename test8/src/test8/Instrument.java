package test8;

abstract public class Instrument {
	String name;
	
	abstract void play();
	
	public void print() {
		System.out.println(name);
	}

}
