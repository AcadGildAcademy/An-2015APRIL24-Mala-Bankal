package test7;

public class axis extends Bank {

	float roi;
	
	public axis(float roi) {
		// TODO Auto-generated constructor stub
		super(roi);
		this.roi = roi;
	}
	
	@Override
	public void getRateOfInterest(float roi) {
		System.out.println("AXIS Bank Rate of interest is :" + roi + "%");
    }

}
