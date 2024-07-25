package week2.day4;

public class TextField extends WebElement {
	
	public void getText() {
		
		System.out.println("Get the text");
	}

	public static void main(String[] args) {
		
		TextField txt = new TextField();
		txt.getText();
		System.out.println(txt.setText("Sivanesh"));

	}

}
