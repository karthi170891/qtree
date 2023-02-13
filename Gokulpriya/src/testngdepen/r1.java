package testngdepen;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class r1 {
	ChromeDriver ob;
	@Test(priority=0, description="Visiting",groups="K")
	public void visitingweb()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
 ob= new ChromeDriver();
		  ob.get("http://www.google.com");//step1
		 
	}
	
	@Test(priority=1, description="maximising",groups="K")
	public void max()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2, description="refreshing", invocationCount=4,groups="K")
	public void refreshing()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3, description="clicking",dependsOnGroups="K")
	public void clicking()
	{
		ob.findElementByLinkText("Images").click();
	}
	
	@Test(priority=4, description="closing",dependsOnGroups="K")
	public void close() throws InterruptedException
	{
		Thread.sleep(3000);
		ob.quit();
	}

}
