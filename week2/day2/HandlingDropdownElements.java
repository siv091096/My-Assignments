package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownElements {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivanesh Babu");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murugadoss");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("GAVS Technologies");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Senior Software Engineer");
		
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd1 = new Select (sourceDropdown);
		
		dd1.selectByIndex(4);
		
		
		WebElement marketingCampaignDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select dd2 = new Select (marketingCampaignDropdown);
		
		dd2.selectByVisibleText("Automobile");
		
		WebElement ownershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select dd3 = new Select (ownershipDropdown);
		
		dd3.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(10000);
		
	    driver.close();

	}

}
