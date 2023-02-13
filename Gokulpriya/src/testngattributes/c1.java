package testngattributes;

import org.testng.annotations.Test;

public class c1 {
	//TestNg=> Test next generation 
	//testing framework
	//Junit
	
	//testcases:  nonstatic
	// @Test
	// default order: alphabetical order
	
	// annotations, attributes, dependency, suite, grouping
	// automatically reports will be generated
	
	//priority : arrange the test case in a particular order
	//description:  add short note on test case 
	//groups
	// invocation count:  run the same test case for multiple time
	// enabled=false  , ignore/disable 
	//timeout: fix timelimit for test CASE
	
	@Test(priority=0,description="ONE",groups="O",invocationCount=4,enabled=false)
	public void t1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(priority=1,description="TWO",groups="O")
	public void t2()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=2,description="THREE",groups="U")
	public void ab()
	{
		System.out.println("Test case 3");
	}
	
	

}
