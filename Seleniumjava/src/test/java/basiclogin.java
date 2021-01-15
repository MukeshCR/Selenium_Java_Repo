import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basiclogin {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@Test
	public void login() throws InterruptedException {
		driver.get(" http://admin-demo.nopcommerce.com/");
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath(" //input[@id='Email']")).clear();
		driver.findElement(By.xpath(" //input[@id='Email']")).sendKeys(" admin@yourstore.com");
		
		driver.findElement(By.xpath("//input[@id='Password']")).clear();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
		
		driver.findElement(By.xpath(" //input[@value='Log in']")).click();
		Thread.sleep(5000);
		
		if(driver.getTitle().equals(" Dashboard / nopCommerce administration"))
		{
			Assert.assertTrue(true);
			System.out.println("Test is passed");
		} else {
			Assert.assertTrue(false);
			System.out.println("test is failed");
		}
		
		
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
