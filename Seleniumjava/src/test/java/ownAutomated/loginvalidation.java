package ownAutomated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginvalidation {

	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.guru99.com/test/newtours/index.php");
		String path = "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Excel\\login validation.xlsx ";

		int rowcount= XLUtils.getRowCount(path, "Sheet1");

		for(int i=1; i<=rowcount; i++)
		{
			String username = XLUtils.getCellData(path, "Sheet1", i, 0);
			String password = XLUtils.getCellData(path, "Sheet1", i, 1);
			driver.findElement(By.xpath("//input[@value='Submit']")).click();

			if (driver.getTitle().equals("Login: Mercury Tours"))
			{
				System.out.println("Test passed");
				XLUtils.setCellData(path, "Sheet1", i, 2, "passed");

			} else {
				System.out.println("test failed");
				XLUtils.setCellData(path, "Sheet1", i, 2, "failed");

			}

			driver.findElement(By.linkText("Home")).click();
		}

		driver.close();
	}

}
