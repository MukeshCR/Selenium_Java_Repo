package testnglisteners;

import org.testng.Assert;
import org.testng.annotations.*;

public class logintest {
	
	@Test
	void setup() {
		Assert.assertTrue(false);
		
	}
	@Test
	void loginbyemail( ) {
		Assert.assertTrue(true);
		
	}
	@Test(dependsOnMethods = {"setup"})    //skipped
	void loginbyfacebook() {
		Assert.assertTrue(true);
		
	}
	

}
