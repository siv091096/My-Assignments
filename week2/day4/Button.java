package week2.day4;

public class Button extends WebElement {
	
	public void submit () {
		
		System.out.println("Submit");
		
	}

	public static void main(String[] args) {
		
		Button but = new Button();
		but.click();
		but.submit();
		

	}

}
