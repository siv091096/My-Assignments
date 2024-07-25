package week2.day4;

public class RadioButton extends Button {
	
	public void selectRadioButton() {
		
		System.out.println("The radio button is selected");
		
	}

	public static void main(String[] args) {
		
		RadioButton rdo = new RadioButton();
		rdo.click();
		rdo.selectRadioButton();

	}

}
