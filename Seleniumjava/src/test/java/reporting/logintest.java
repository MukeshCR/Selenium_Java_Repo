package reporting;

import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.google.common.io.Files;

public class logintest {
	
	static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
	
	@Test
	public void login() {
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//input[@name='userName'] ")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Assert.assertEquals(driver.getTitle(), "Login: Mercury Tours");
		}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
		}
	
	public void captureScreenshot(ITestResult result) throws IOException
	{
		if(result.getStatus()== ITestResult.FAILURE)
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src= ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir")+ "/Screenshot/"+ result.getName()+ " .png");
			Files.copy(src,target);
			System.out.println("screenshot captured");
			
		}
	}
	
	
	
	
	

}
