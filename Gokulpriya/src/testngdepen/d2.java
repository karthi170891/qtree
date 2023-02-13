package testngdepen;

import org.testng.annotations.Test;

public class d2 {

	//dependsOnGroups: create connection between test cse and group
	
	@Test(priority=0,groups="I")
	public void enu()
	{
		System.out.println("username");
	}
	
	@Test(priority=1,groups="I")
	public void enp()
	{
		System.out.println("pwd");
	}
	
	@Test(priority=2,groups="I")
	public void login()
	{
		System.out.println("lbg");
	}
	
	@Test(priority=3,dependsOnGroups="I")
	public void home()
	{
		System.out.println("home");
	}
	
	//I: 3 tcsc:    pass      home: pass
	// 1fails                 home: skipped
}
