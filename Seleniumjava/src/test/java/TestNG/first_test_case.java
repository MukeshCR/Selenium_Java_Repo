package TestNG;

import org.testng.annotations.Test;

public class first_test_case {

	@Test(priority = 1)
	void openURl() 
	{
		System.out.println("This is open url");

	}
	
	@Test(priority = 2)
	void login()
	{
		System.out.println("this is login");
	}
	
	@Test(priority = 3)
	void logout() {

		System.out.println("this is logout");
	}

}
