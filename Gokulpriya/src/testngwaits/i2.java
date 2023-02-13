package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class i2 {

	/* 
	 * explicit wait: time limit is applicable for particular condition
	 * 
	 * create an object for webdriver wait class
	 * pass driver instance and time limit as input
	 * call untill method
	 * call expected conditions 
	 * 
	 * 
	 code is correct:  executes within the time limit, it will not wait for the completion of time limit, it will proceed further
	 * 
	 * code is wrong: it will wait for completion of time limit, then it will throw up error 
	 * 
 * 
	 * */
	
	@Test
	public void hard()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 ChromeDriver ob= new ChromeDriver();
	     ob.get("http://www.google.com");
	     WebDriverWait w= new WebDriverWait(ob,5);
	     
	     //title
	    // w.until(ExpectedConditions.titleIs("Google"));//5
	    // w.until(ExpectedConditions.titleContains("oo")); //5
	     
	     // alert is present or not
	    // w.until(ExpectedConditions.alertIsPresent()); //5
	     
	     // visibility of an element
	     // find the element and check its visibility 
	    // w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Privacy")));//5
	     
	     // visibility of all images
	     //w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
	     
	     // checking whether element is clickable
	     //w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images"))); 
	     
	     // number of images
	     w.until(ExpectedConditions.numberOfElementsToBe(By.tagName("img"),3 ));
	     
	     ob.quit();
}
}
