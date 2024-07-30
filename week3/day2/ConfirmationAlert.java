package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on the Show button for Alert (Confirm Dialog)	
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		//Transfer the driver focus to Alert box
		Alert confirmationAlert = driver.switchTo().alert();
		
		//Get the Text of Alert dialog box
		String alertText = confirmationAlert.getText();
		
		//Print the Text in the Alert dialog box
		System.out.println("Text in the Alert (Confirm Dialog): "+alertText);
		
		//Dismiss the alert
		confirmationAlert.dismiss();
		
		//Get the Text of Acknowledgement message
		String ackMessage = driver.findElement(By.xpath("//span[@id='result']")).getText();
		
		//Print the Acknowledgement message
		System.out.println(ackMessage);
		
		//Close the browser window
		driver.close();
		

	}

}
