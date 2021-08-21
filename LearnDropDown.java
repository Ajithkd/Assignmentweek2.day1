package week2.day1;

import static org.testng.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
		//locate the WebElement 
		 * three ways to select the dropdown elements
		 * drpDwn.selectByIndex( index value )
		 * drpDwn.selectByValue(    )
		 * drpDwn.selectByVisibleText(   )
       */
		
		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select drpDwn =new Select(drop1);
		drpDwn.selectByIndex(1);
		
		
		WebElement drop2 = driver.findElement(By.name("dropdown2"));
		Select drpDwn2 = new Select(drop2);
		drpDwn.selectByVisibleText("UFT/QTP");
		
		WebElement drop3 = driver.findElement(By.id("dropdown3"));
		Select drpDwn3 = new Select(drop3);
		drpDwn.selectByValue("4");
		
		//Get the size of the dropdown (number of dropdown elements)
		int sizeDrpDwn3 = drpDwn3.getOptions().size();
		System.out.println("size of the third drop down:" + sizeDrpDwn3);
	}

}
