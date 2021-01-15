package ownAutomated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Calculator {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String path = "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Excel\\Caldata.xlsx";
		
		XLUtils.setExcelFile(path, "Sheet1");   
		
		int rowocunt= XLUtils.getRowCount(path, "Sheet1");
		 
		for(int i = 1; i<=rowocunt; i++)
		{
			int princ= Integer.parseInt(XLUtils.getCellData(path, "Sheet1", i, 0));
			int rateofintrest = Integer.parseInt(XLUtils.getCellData(path, "Sheet1", i, 1));
			int per = Integer.parseInt(XLUtils.getCellData(path, "Sheet1", i, 2));
			String fre = XLUtils.getCellData(path, "Sheet1", i, 3);
			double exp_maxvalue= Double.parseDouble(XLUtils.getCellData(path, "Sheet1", i, 4));
			
			
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(String.valueOf(princ));
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(String.valueOf(rateofintrest));
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(String.valueOf(per));
			
			Select period_dd= new Select(driver.findElement(By.id("tenurePeriod")));
			period_dd.selectByVisibleText("year(s)");
			
			
			Select Fre = new Select(driver.findElement(By.id("frequency")));
			Fre.selectByVisibleText(fre);
			
			driver.findElement(By.xpath("//div[@class='PT25']//a[1]//img[1]")).click();
			
			String act_maxvalue = driver.findElement(By.xpath("//*[@id='resp_matval']/strong")).getText();
			
			if (exp_maxvalue==Double.parseDouble(act_maxvalue)) 
			{
				System.out.println("Test PASS");
				
			} else {
				System.out.println("Test FAIL");

			}
			
			driver.findElement(By.xpath("//img[@class='PL5']")).click();  //clear button
			
			Thread.sleep(3000);
			
			
			
			}
			
	}

}
