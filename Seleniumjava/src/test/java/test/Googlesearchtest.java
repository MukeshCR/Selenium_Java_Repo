package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageobjects.Googlesearchpage;

public class Googlesearchtest {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googlesearch();
	}
	
	public static void googlesearch() {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation step by step");
		
		Googlesearchpage.textbox_search(driver).sendKeys("Automation step by step");
		
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']")).click();
		
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']")).sendKeys(Keys.RETURN);
		
		Googlesearchpage.button_search(driver).click();
		
		driver.close();
		
		System.out.println("Test completed successfully");
	}

}
