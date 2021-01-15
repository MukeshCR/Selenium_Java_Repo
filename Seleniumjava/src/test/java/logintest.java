import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logintest {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	}

	@Test
	public void login() {
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//input[@name='userName'] ")).sendKeys("Mercury");
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


