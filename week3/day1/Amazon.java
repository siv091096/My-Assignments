package week3.day1;

public class Amazon extends CanaraBank {

	public static void main(String[] args) {
		
		Amazon amz = new Amazon();
		amz.upiPayments();
		amz.recordPaymentDetails();

	}

	@Override
	public void cashOnDelivery() {
		System.out.println("Payment mode is Cash on Delivery");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Payment mode is Card payment");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Payment mode is Internet Banking");
		
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("INR 2000 paid through UPI");
		
	}

}
