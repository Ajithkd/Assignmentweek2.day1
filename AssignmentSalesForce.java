package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentSalesForce {
	public static void main(String[] args) {
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver= new ChromeDriver();
		// Step 3: Load the URL 
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Step 6: Fill in all the text boxes
		driver.findElement(By.name("UserFirstName")).sendKeys("Aj");
		driver.findElement(By.name("UserLastName")).sendKeys("sam");
		driver.findElement(By.name("UserEmail")).sendKeys("samaj@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("LTR SOLUTIONS");
		driver.findElement(By.name("UserPhone")).sendKeys("8765765465");
		
		// Step 7: Handle all the dropdowns
		WebElement ut=driver.findElement(By.name("UserTitle"));
		Select utobj = new Select(ut);
		utobj.selectByValue("Customer_Service_Manager_AP");
		
		WebElement ce=driver.findElement(By.name("CompanyEmployees"));
		Select ceobj = new Select(ce);
		ceobj.selectByValue("9");
		
		WebElement cc=driver.findElement(By.name("CompanyCountry"));
		Select ccobj = new Select(cc);
		ccobj.selectByValue("US");
		
		WebElement cs=driver.findElement(By.name("CompanyState"));
		Select csobj = new Select(cs);
		csobj.selectByValue("AK");
		
		// Step 8: Click the check box
		driver.findElement(By.className("checkbox-ui")).click();
		// Step 9: Close the browser
		driver.close();
	}


	}


