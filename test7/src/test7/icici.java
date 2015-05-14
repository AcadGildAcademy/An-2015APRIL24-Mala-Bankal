package test7;

public class icici extends Bank {

	float roi;
	
	public icici(float roi) {
		super(roi);
		this.roi = roi;
	}
	
	@Override
	public void getRateOfInterest(float roi) {
		System.out.println("ICICI Bank Rate of interest is :" + roi + "%");
    }
	
}
