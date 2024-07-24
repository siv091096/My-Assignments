package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountUsingSelect {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Amazon Digital 2");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
		Select dd1 = new Select (industryDropdown);
		dd1.selectByIndex(3);
		WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
		Select dd2 = new Select (ownershipDropdown);
		dd2.selectByVisibleText("S-Corporation");
		WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
		Select dd3 = new Select (sourceDropdown);
		dd3.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingCampaignDropdown = driver.findElement(By.id("marketingCampaignId"));
		Select dd4 = new Select (marketingCampaignDropdown);
		dd4.selectByIndex(6);
		WebElement stateProvinceDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dd5 = new Select (stateProvinceDropdown);
		dd5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(10000);
		driver.close();

	}

}
