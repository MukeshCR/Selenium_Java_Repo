package ownAutomated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class simpleinterestcalculator {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.easycalculation.com/simple-interest.php");
		driver.manage().window().maximize();
		
		String path = "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Excel\\Simple interest calculator.xlsx ";
		
		XLUtils.setExcelFile(path, "Sheet1");
		 int Row= XLUtils.getRowCount(path, "Sheet1");
		 
		 for(int i=1; i<=Row; i++)
		 {
			 int principle= Integer.parseInt(XLUtils.getCellData(path, "Sheet1", i, 0));
				int rateofintrest = Integer.parseInt(XLUtils.getCellData(path, "Sheet1", i, 1));
				int period = Integer.parseInt(XLUtils.getCellData(path, "Sheet1", i, 2));
				int simpleinterest = Integer.parseInt(XLUtils.getCellData(path, "Sheet1", i, 3));
				
				
				driver.findElement(By.xpath("//input[@name='res1']")).sendKeys(String.valueOf(principle));
				driver.findElement(By.xpath("//input[@name='res2']")).sendKeys(String.valueOf(rateofintrest));
				driver.findElement(By.xpath("//input[@name='res3']")).sendKeys(String.valueOf(period));
				
				
				Select dd = new Select(driver.findElement(By.xpath("//select[@name='time']")));
				dd.selectByVisibleText("Years");
				
				if (driver.getTitle().equals("Simple Interest Calculator")) 
				{
					System.out.println("Test passed");
					XLUtils.setCellData(path, "Sheet1", i, 4, "passed");
					
				} else {
					System.out.println("Test Failed");
					XLUtils.setCellData(path, "Sheet1", i, 4, "failed");

				}
				
			  driver.findElement(By.xpath("//div[@id='dispCalcConts']//input[@value='Reset']")).click();
		 }
		
	}

}
