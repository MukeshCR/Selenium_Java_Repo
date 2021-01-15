package pack1;

import org.testng.annotations.*;

public class TC2 {

	@Test
	void m3() {
		System.out.println("this is m1 from Testcase3");

	}

	@Test
	void m4() {
		System.out.println("this is m2 from Testcase4");
	}
	
	@Test
	void m5() {
		System.out.println("this is m2 from Testcase5");
	}
	
	@AfterTest
	void nn() {
		System.out.println("this is nn");
	}

	
	
	
}
