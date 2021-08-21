package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// step1: Download the set path
		WebDriverManager.chromedriver().setup();
		// step2: launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		// step3: load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// step4: maximise the window
		driver.manage().window().maximize();
		
		
		//wait for 10 secs if the element is not in the dom
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// STEP5: Locate the username and enter the username as demosalesmanager
    	WebElement webuser =driver.findElement(By.id("username"));
    	webuser .sendKeys("demosalesmanager");
    	
    	// step6: locate the password webelement and enter the password as crmsfa
    	driver.findElement(By.id("password")).sendKeys("crmsfa");
    
    	
    	// step7: locate the login button and click on it
    	driver.findElement(By.className("decorativeSubmit")).click();
    	
    	//step8: click on the crmsfa link
    	driver.findElement(By.linkText("CRM/SFA")).click();
    	
    	// step9: Click leadstab
		driver.findElement(By.linkText("Leads")).click();
		
		// step10: click createlead
		driver.findElement(By.linkText("Create Lead")).click();
		
		// step11: Enter CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		// step12: enter firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Radha");
		 
		// step13: enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishna");
		
		//step14: enter countrycode
		//clear the text by using - clear()
		//then use sendkeys()
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("5");
		
		//click Createlead button
		driver.findElement(By.name("submitButton")).click();
		
		

	}

}
