package test7;

public class sbi extends Bank {

	float roi;
	
	public sbi(float roi) {
		// TODO Auto-generated constructor stub
		super(roi);
		this.roi = roi;
	}
	
	@Override
	public void getRateOfInterest(float roi) {
		System.out.println("SBI Bank Rate of interest is :" + roi + "%");
    }

}
