package seleniumexe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//creation
		// alert:  popup/messagebox/confirmation
		
	   // ob.executeScript("alert('time out')"); //ok
	    
	    ob.executeScript("window.confirm('time out')"); // ok and cancel
	    
	    Thread.sleep(3000);
	    
	    // accept/dismiss
	    Alert al = ob.switchTo().alert();
	    al.accept();
		
	    Thread.sleep(3000);
		ob.quit();
	}
}
