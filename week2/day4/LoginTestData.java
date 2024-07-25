package week2.day4;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		
		System.out.println("The username is entered");
		
	}
	
	public void enterPassword() {
		
		System.out.println("The password is entered");
		
	}

	public static void main(String[] args) {
		
		LoginTestData td = new LoginTestData();
		td.enterUsername();
		td.enterPassword();
		td.enterCredentials();
		td.navigateToHomePage();
		

	}

}
