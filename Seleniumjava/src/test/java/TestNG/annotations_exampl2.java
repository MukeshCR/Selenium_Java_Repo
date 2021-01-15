package TestNG;

import org.junit.BeforeClass;
import org.testng.annotations.*;

public class annotations_exampl2 {

	@BeforeClass
	void login() {
		System.out.println("this is login");

	}
	@AfterClass
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
