package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();  // Launching the browser
		driver.get("http://leaftaps.com/opentaps/control/main"); // Loading the URL
		driver.manage().window().maximize(); // Maximizing the browser window
		driver.close(); // Closing the browser

	}

}
