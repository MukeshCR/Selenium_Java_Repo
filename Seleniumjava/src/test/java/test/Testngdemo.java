package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
	WebDriver driver =  null;
	
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void actualtest() {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation step by step");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']")).sendKeys(Keys.ENTER);
	}
	
	@AfterTest
	public void teardowntest() {
		System.out.println("Test successfully completed");
		
	}

}
