package week2.day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver ();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.close();

	}

}
