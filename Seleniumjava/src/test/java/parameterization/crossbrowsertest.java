package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsertest {

	WebDriver driver = null;


	@Parameters("browser")
	@Test (priority = 1)
	public void launchbrowser(String brw) {

		if(brw.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/mukesh/eclipse-workspace/Seleniumjava/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			if(brw.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:/Users/mukesh/eclipse-workspace/Seleniumjava/Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}
		
		driver.get("http://demo.guru99.com/test/newtours/index.php");

	}

	@Test(priority = 2)
	public void verifytitle() {
		
		Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours ");


	}
	@Test(priority = 3)
	public void registration() {
		Assert.assertTrue(true);

	}
	@Test(priority = 4)
	public void closebrowser() {
		
		driver.close();

	}
}

