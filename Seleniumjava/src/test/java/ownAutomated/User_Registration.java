package ownAutomated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class User_Registration {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		String path = "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Excel\\User_registration.xlsx";
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("AAAAAA");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("aaaaa");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("a@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("ANDHRAPRADESH");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("561000");
		
		Select drpdn = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		drpdn.selectByVisibleText("INDIA");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("a@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("aaaaa");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("aaaaa");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		
		
		
		
	}

}
