package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlert {

	public static void main(String[] args) {
		
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on the Show button for Sweet Alert (Simple Dialog)	
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		
		//Click on the Dismiss message
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		//Close the browser window
		driver.close();

	}

}
