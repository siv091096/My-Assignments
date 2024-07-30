package week3.day1;

public abstract class CanaraBank implements Payments {
	
	public abstract void recordPaymentDetails();
	
	public void upiPayments() {
		
		System.out.println("Payment mode is UPI");
		
	}

}
