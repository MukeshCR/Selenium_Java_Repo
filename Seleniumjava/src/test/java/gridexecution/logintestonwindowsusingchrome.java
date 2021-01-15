package gridexecution;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class logintestonwindowsusingchrome {
	
	WebDriver driver;
	
	
	@Test (priority = 1)
	void setup() throws MalformedURLException{
		
		String nodeURL= "http://192.168.1.113:4444/wd/hub";
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WIN10);
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Drivers\\geckodriver.exe");
		driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
		}
	
	@Test(priority = 2)
	void login() 
	{
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//input[@name='userName'] ")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		if (driver.getTitle().equals("Login: Mercury Tours"))
		{
			System.out.println("Test passed");

		} else {
			System.out.println("test failed");

		}

		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		
		driver.close();
		
	}
		
	}

