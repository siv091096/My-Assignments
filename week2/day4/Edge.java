package week2.day4;

public class Edge extends Browser {

    public void takeSnap() {
    	
    	System.out.println("Snapshot is taken");
		
	}
	
	public void clearCookies() {
		
		System.out.println("Cookies are cleared");
		
	}
	
	public static void main(String[] args) {
		
		Edge edg = new Edge();
		edg.openURL();
		edg.clearCookies();
		edg.takeSnap();
		edg.navigateBack();
		edg.closeBrowser();
		System.out.println("The browser name is "+edg.browserName2);
		System.out.println("The browser version is "+edg.browserVersion2);
	}

}
