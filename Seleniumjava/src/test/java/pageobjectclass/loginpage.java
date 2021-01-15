package pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver Idriver;
	
	loginpage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="username")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement buttonsignin;
	
	public void setusername(String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void clicksubmit() 
	{
		buttonsignin.click();
		
	}

}
