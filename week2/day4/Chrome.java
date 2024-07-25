package week2.day4;

public class Chrome extends Browser {
	
    public void openIncognito() {
    	
    	System.out.println("Browser opened in Incognito mode");
		
	}
	
	public void clearCache() {
		
		System.out.println("Cache is cleared");
		
	}
	
	public static void main(String[] args) {
		
		Chrome chr = new Chrome();
		chr.openIncognito();
		chr.clearCache();
		chr.openURL();
		chr.navigateBack();
		chr.closeBrowser();
		System.out.println("The browser name is "+chr.browserName1);
		System.out.println("The browser version is "+chr.browserVersion1);
		
	}

}
