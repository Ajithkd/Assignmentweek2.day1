package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		WebElement webuser =driver.findElement(By.id("username"));
		webuser.sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		 
		// verify if the landing page is correct
		// My Home | opentaps CRM
		String tittle = "My Home | opentaps CRM";
		String hometittle = driver.getTitle();
		
		if(tittle.equals(hometittle)) {
			System.out.println("in the home page");
			
		}
		else
			System.out.println("Not in the home page");
		
		
	}

}
