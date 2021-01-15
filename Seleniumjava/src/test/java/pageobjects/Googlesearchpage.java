package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Googlesearchpage {
	
	static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver) {
		
		element= driver.findElement(By.xpath("//input[@title='Search']"));
		return element;
		
	}
	
	
	public static WebElement button_search(WebDriver driver) {
		
		element= driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']"));
		return element;
	}
	
	

}
