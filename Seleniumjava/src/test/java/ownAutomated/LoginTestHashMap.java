package ownAutomated;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestHashMap {
	
	
	static HashMap <String , String> Logindata() 
	{
		
		HashMap <String , String> hm = new HashMap <String, String>();
		
		hm.put("x", "mercury@mercury");
		hm.put("y", "mercury1@mercury1");
		hm.put("z", "mercury2@mercury1");
		return hm;
		
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		 String Credentials = Logindata().get("x");
		 
		String userarr[] =Credentials.split("@"); //splitting
		
		driver.findElement(By.xpath("//input[@name='userName'] ")).sendKeys(userarr[0]);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(userarr[1]);
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
