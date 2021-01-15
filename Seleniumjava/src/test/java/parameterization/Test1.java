package parameterization;

import org.testng.annotations.*;

public class Test1 {
	
	@Parameters({"a","b"})
	@Test
	public void m1(String s1, String s2) 
	{
		
		System.out.println(s1+s2);
		
	}
	
	@Test
	public void m2() 
	{
		
		System.out.println("Hello world");
		
	}
	
	
	

}
