package test7;

//method overriding assignment

public class Bank {
	float roi;
		
	public Bank(float roi) {
		this.roi = roi;
		
	}
	
    public void getRateOfInterest(float roi) {
    	System.out.println("General Bank Rate of interest is :" + roi+ "%");
    }
    
        
}
