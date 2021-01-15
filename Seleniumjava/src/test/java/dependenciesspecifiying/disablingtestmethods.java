package dependenciesspecifiying;

import org.testng.Assert;
import org.testng.annotations.Test;

public class disablingtestmethods {
	
	@Test(priority = 1)
	void openurl() {
		System.out.println("url opened");
		Assert.assertTrue(true);
	}


	@Test(priority = 2)
	void login() {
		System.out.println("login test");
		Assert.assertTrue(true);
	}


	@Test(priority = 3,enabled = false) //intentionally disabled test
	void search() {
		System.out.println("search test");
		Assert.assertTrue(true);
	}


	@Test(priority = 4,enabled = false)  //intentionally disabled test
	void advancesearch() {
		System.out.println("advance search test");
		Assert.assertTrue(true);
	}


	@Test(priority = 5)
	void logout() {
		System.out.println("logout test");
		Assert.assertTrue(true);
	}

}
