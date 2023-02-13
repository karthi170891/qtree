package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglistener.c1.class)
public class i1 {
	
	/*testng webdriversynchronisation tech
	 * 
	 *    conditional      : explicit 
	 *    unconditional    :  implicit wait, thread.sleep()
	 *    
	 *    implicit wait: once it is declared all the code which is present after it will take the time limit
	 * 
	 * 
	 * 
	 * code is correct:  executes within the time limit, it will not wait for the completion of time limit, it will proceed further
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
	     ob.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	     System.out.println(ob.getTitle());//4
	     System.out.println(ob.getCurrentUrl());//4
	     ob.navigate().refresh();//4
	    WebElement ele = ob.findElementByLinkText("Privacy"); //4
	    ele.click();//4
	    ob.quit();//4
	}
	

}
