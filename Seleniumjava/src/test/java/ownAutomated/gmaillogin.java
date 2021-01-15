package ownAutomated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmaillogin {
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukesh\\eclipse-workspace\\Seleniumjava\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dgmail%2Blogin%26rlz%3D1C1ONGR_enIN931IN931%26oq%3Dgmail%26aqs%3Dchrome.1.69i57j0i271l2j69i61l2.3746j0j7%26sourceid%3Dchrome%26ie%3DUTF-8&ec=GAZAAQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("crkumarmukesh@gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("yOUANDME@7.");
		driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc VfPpkd-ksKsZd-mWPk3d-OWXEXe-AHe6Kc-XpnDCe']//div[@class='VfPpkd-RLmnJb']")).click();
		
		System.out.println("Login successfully completed");
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
