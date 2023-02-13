package seleniumbrowserutility;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class resize {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.google.com");
	
	// create an object for dimension class
	// pass desired height and width value in it 
	//apply it on the window 
	
	//500,600
	
	Dimension d= new Dimension(400,500);
	ob.manage().window().setSize(d);
	
	Thread.sleep(3000);
	ob.quit();
}
}
