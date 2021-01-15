package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		System.setProperty("webdriver.gecko.driver", "C:/Users/mukesh/eclipse-workspace/Seleniumjava/Drivers/geckodriver.exe");
		 driver = new FirefoxDriver();

	}
	
	@Test(dataProvider="users")// dataProvider is a parameter of @Test annotation
	void logintest(String uname, String pwd) {
		
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//input[@name='userName'] ")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Assert.assertEquals(driver.getTitle(), "Login: Mercury Tours");
		
		}
	@DataProvider(name="users") //@DataProvider is annotation
	String[][] loginData()
	{
		String data [] [] = {{"mercury","mercury"},{"mercury1","mercury1"},{"mercury2","mercury2"}};
		return data;
	}
	@AfterClass
	void closebrowser() {
		driver.close();
	

	}

}
