package week2.day4;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
		
		System.out.println("The checkbox button is clicked");
	}

	public static void main(String[] args) {
		
		CheckBoxButton cbx = new CheckBoxButton();
		cbx.click();
		cbx.clickCheckButton();

	}

}
