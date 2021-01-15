package dependenciesspecifiying;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencymethods {


	@Test(priority = 1)
	void openurl() {
		System.out.println("url opened");
		Assert.assertTrue(true);
	}


	@Test(priority = 2,dependsOnMethods={"openurl"})
	void login() {
		System.out.println("login test");
		Assert.assertTrue(true);
	}


	@Test(priority = 3,dependsOnMethods = {"login"})
	void search() {
		System.out.println("search test");
		Assert.assertTrue(true);
	}


	@Test(priority = 4,dependsOnMethods = {"login","search"})
	void advancesearch() {
		System.out.println("advance search test");
		Assert.assertTrue(true);
	}


	@Test(priority = 5,dependsOnMethods = {"login"})
	void logout() {
		System.out.println("logout test");
		Assert.assertTrue(true);
	}
}
