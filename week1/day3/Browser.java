package week1.day3;

public class Browser {
	
	public String launchBrowser(String browserName) {
		return "Browser launched successfully";
	}
	
	void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		
		Browser brow = new Browser();
		System.out.println(brow.launchBrowser("Chrome"));
		brow.loadUrl();

	}

}
