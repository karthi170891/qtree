package testngattributes;

import org.testng.annotations.Test;

public class c2 {

	
	@Test(timeOut=1000)
	public void t2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("hi");
	}
}
