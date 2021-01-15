package ownAutomated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class User_registration2 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		String path = "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Excel\\User_registration.xlsx";
		
		driver.manage().window().maximize();
		
		XLUtils.setExcelFile(path, "Sheet1");
		
		int rowcount = XLUtils.getRowCount(path, "Sheet1");
		
		for(int i=1; i<=rowcount; i++)
		{
			
			String F_name = XLUtils.getCellData(path, "Sheet1", i, 0);
			String l_name = XLUtils.getCellData(path, "Sheet1", i, 1);
			int phonenum = Integer.parseInt(XLUtils.getCellData(path, "Sheet1", i, 2));
			String email = XLUtils.getCellData(path, "Sheet1", i, 3);
			String Address = XLUtils.getCellData(path, "Sheet1", i, 4);
			String city = XLUtils.getCellData(path, "Sheet1", i, 5);
			String state = XLUtils.getCellData(path, "Sheet1", i, 6);
			int pincode = Integer.parseInt(XLUtils.getCellData(path, "Sheet1", i, 7));
			String Country = XLUtils.getCellData(path, "Sheet1", i, 8);
			String username = XLUtils.getCellData(path, "Sheet1", i, 9);
			String password = XLUtils.getCellData(path, "Sheet1", i, 10);
			
			
			

			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(F_name);
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(l_name);
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(String.valueOf(phonenum));
			driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(Address);
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(String.valueOf(pincode));
			
			Select countrydrpdn = new Select(driver.findElement(By.xpath("//select[@name='country']")));
			countrydrpdn.selectByVisibleText(Country);
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(password);
			
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			
			
			driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();  //to enter new person details
			
			
			
			
			
			
			
		}
	}

}
