package seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {
public static void main(String[] args) throws InterruptedException {
	
	//step1: configuring chrome driver
	//step2: creating object for chromedriver class
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.google.com");
	
	// max
	//ob.manage().window().maximize();
	
	//fullscreen
	//ob.manage().window().fullscreen();
	
	ob.navigate().refresh();
	
	// hold the page for certain seconds
	Thread.sleep(3000);
	
	//close
	ob.quit();
}
}
