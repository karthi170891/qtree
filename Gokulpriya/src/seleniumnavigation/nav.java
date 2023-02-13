package seleniumnavigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nav {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//step1: opening google in first tab
	//       opening seleniumeasy.com in second tab 
	
    driver.get("http:\\www.google.com");
    driver.manage().window().maximize();
    
   //open seleniumeasy.com in new tab   
 driver.executeScript("window.open('https://www.seleniumeasy.com','_blank');");
 
 //step2:  
 // getting control of first tab : driver.getwindowhandle()=>  parent
 // getting control of both tabs:  driver.getwindowhandles()=> s={googl.com, seleniumeasy.com}
 String parent=driver.getWindowHandle();// control will be in the parent window //google
 // collecting all the handle
  Set<String> s1 = driver.getWindowHandles();// 2(both the tabs = collected)
 
  //step3: iterator 
  
 Iterator<String> I1 = s1.iterator();  // hasNext , next()

//step4: switching
  while(I1.hasNext())
	  // has next=> whether any content is there 
	  // next=> read that value 
    {
      String child_window=I1.next();
      if(!parent.equals(child_window))// picking the seleniumeasy.com
    	  { // control is moved to child window 
        driver.switchTo().window(child_window);
        Thread.sleep(4000);
        driver.findElementByLinkText("Maven").click();
        Thread.sleep(4000);
        driver.close();
      }
      
      /*parent=google   s={google, seleniumeasy.com}
       * 
       * first iteration:  I1 points to first element in set 
       * I1 points to google.com
       *   checking the content
       *    I1.next reads google.com and store it in child_window
       *     child_window=google.com
       *     if parent!=child_window
       *        google!=google
       *        terminate
       *        
       * second iteration: I1 points to second element in the set
       * I1 points to selenium easy.com
       *    checking the content
       *      I1.next reads seleniumeasy.com and store it in child_window
       *      child_window=seleniumesy.com
       *      if parent!=child_window
       *         google!=seleniumeasy.com
       *           switching control to the child window
       *           moving cursor to the seleniumeasy.com
       *            maven
       *            close : close the tab which is in focus 
       *third iteration: I1 points to null
       *terminate
       *
       **switching control back to parent
       *title
       *Images=> linktext -> click
       *5 seconds 
       *close 
       * * 
       * */
      
  }

    driver.switchTo().window(parent);//google 
    System.out.println(driver.switchTo().window(parent).getTitle());// google
    //driver.findElement(By.linkText("Images")).click();
    Thread.sleep(5000);
    driver.findElementByLinkText("Images").click();
    Thread.sleep(5000);
    driver.quit();
}
}



 





