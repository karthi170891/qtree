package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class a1 {
	
	//assertion: tech where we will be comparing actual result with obtaind result
	/*
	 * hard asserts
	 *     provided by Assert builtin class
	 *     static in nature 
	 *     if assertion fails, it wont proceed further
	 *     
	 * soft asserts
	 *     provided by SoftAssert builtin class
	 *     nonstatic in nature
	 *     even if assertion fails, it will proceed
	 *     call assertAll()
	 * 
	 * assertEquals(actual, expected)
	 * assertNotEquals(actual, expected)
	 * assertTrue(condition)
	 * assertFalse(condition)
	 * * 
	 * */
	
	@Test
	public void hard()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 ChromeDriver ob= new ChromeDriver();
	     ob.get("http://www.google.com");//step1
	    // Assert.assertEquals(ob.getTitle(),"yahoo");
	     Assert.assertNotEquals(ob.getTitle(),"yahoo");//pass
	     WebElement ele = ob.findElementByLinkText("Privacy");
	     Assert.assertTrue(ele.isDisplayed());
	     Assert.assertFalse(ele.isSelected());
	     ob.quit();
	}

}
