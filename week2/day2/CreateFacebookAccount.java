package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Max");
		driver.findElement(By.name("lastname")).sendKeys("Dawson");
		driver.findElement(By.name("reg_email__")).sendKeys("9600653981");
		driver.findElement(By.name("reg_passwd__")).sendKeys("F@Me5&?aFosW");
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		Select dd1 = new Select (dayDropdown);
		dd1.selectByIndex(5);
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select dd2 = new Select (monthDropdown);
		dd2.selectByValue("2");
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select dd3 = new Select (yearDropdown);
		dd3.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("//input[@value=2]")).click();
		Thread.sleep(10000);
		driver.close();

	}

}
