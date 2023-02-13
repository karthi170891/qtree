package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class a2 {
	
	@Test
	public void soft()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 ChromeDriver ob= new ChromeDriver();
	     ob.get("http://www.google.com");//step1
	     SoftAssert s= new SoftAssert();
	     s.assertEquals(ob.getTitle(),"yahoo");//fail
	     s.assertNotEquals(ob.getTitle(),"yahoo");//pass
	     WebElement ele = ob.findElementByLinkText("Privacy");
	     s.assertTrue(ele.isDisplayed());//pass
	     s.assertFalse(ele.isSelected());//pass
	     ob.quit();
	     s.assertAll();
	}


}
