package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFacebook {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("aji");
		driver.findElement(By.name("lastname")).sendKeys("sam");
		driver.findElement(By.name("reg_email__")).sendKeys("samaj@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("samaj@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("abjisjt");
		
		
		WebElement day = driver.findElement(By.id("month"));
		Select dayobj =new Select((WebElement) day);
		dayobj.selectByValue("20");
		
		WebElement mon = driver.findElement(By.id("month"));
		Select monobj = new Select(mon);
		monobj.selectByValue("9");
		
		WebElement year = driver.findElement(By.id("year"));
		Select yrobj = new Select(year);
		yrobj.selectByValue("1996");
		
		//select Radio button
		driver.findElement(By.className("_58mt")).click();
		driver.close();
		
		
		
		
		
	}

}
