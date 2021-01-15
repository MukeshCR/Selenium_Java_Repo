package TestNG;

import org.testng.annotations.*;

public class annontationsexample1 {
	@BeforeMethod
	void login() {
		System.out.println("this is login");

	}
	@AfterMethod
	void logout() {
		System.out.println("this is logout");
	}
	@Test(priority = 1)
	void search() {
		System.out.println("this is search");
		
	}
	@Test(priority = 2)
	void advance_search() {
		System.out.println("this is advance search");
		
	}
	@Test(priority = 3)
	void recharge() {
		System.out.println("this is recharge");
		
	}
}
