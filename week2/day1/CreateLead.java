package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivanesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Babu");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("GAVS Technologies");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Senior Software Engineer");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();

	}

}
