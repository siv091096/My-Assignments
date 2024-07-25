package week2.day4;

public class Safari extends Browser {

    public void readerMode() {
    	
    	System.out.println("Browser is in reader mode");
		
	}
	
	public void fullScreenMode() {
		
		System.out.println("Browser is in full screen mode");
		
	}
	
	public static void main(String[] args) {
		
		Safari saf = new Safari();
		saf.openURL();
		saf.fullScreenMode();
		saf.readerMode();
		saf.navigateBack();
		saf.closeBrowser();
		System.out.println("The browser name is "+saf.browserName3);
		System.out.println("The browser version is "+saf.browserVersion3);
		
		
	}

}
