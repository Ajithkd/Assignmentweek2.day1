package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentCreateLead {
	public static void main(String[] args) {
		
		

		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tidel park");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("AJITH");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KUMAR");
				WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select drpDwn = new Select(drop1);
				drpDwn.selectByIndex(4);
				WebElement drop2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select drpDwn1 = new Select(drop2);
				drpDwn1.selectByIndex(3);
				WebElement drop3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select drpDwn2 = new Select(drop3);
				drpDwn2.selectByVisibleText("Corporation");
				WebElement prim = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
				prim.clear();
				prim.sendKeys("5");
				driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("A");
				driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("G block kabalithottam");
				driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
				driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Mylapore");
				driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600004");
				WebElement drop4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
				Select drpDwn3 = new Select(drop4);
				drpDwn3.selectByVisibleText("India");
			    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/20/96");
		        driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("60");
				driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("44");
				driver.findElement(By.name("submitButton")).click();
				String fs = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
				System.out.println("FS:" + fs);
				
				
				
		
	}

}
