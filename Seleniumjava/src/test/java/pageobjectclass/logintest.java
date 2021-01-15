package pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest {

	WebDriver driver;
	
	void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
	}
	
	void login() {
		loginpage lp =new loginpage(driver);
				lp.setusername("mercury");
				lp.setpassword("mercury");
				lp.clicksubmit();
		
	}
}
