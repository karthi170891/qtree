package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class scrolle {
public static void main(String[] args) throws InterruptedException {
	//scrollers:
	
	// horizontal scroller: move along x axis, y value will be 0
	//            right: +x
	//            left: -x
	
	//vertical scroller: move along y axis, x value will be 0
	//             down: +y
	//              up   : -y
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.seleniumeasy.com");
	
	//method1: page up and page down
	
	/*ob.executeScript("window.scrollBy(0,document.body.scrollHeight)");//page down
	Thread.sleep(3000);
	ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//page up
	Thread.sleep(3000);*/
	
	ob.executeScript("window.scrollBy(0,1000)");//scroll down
	Thread.sleep(3000);
	ob.executeScript("window.scrollBy(0,-1000)");//scroll up
	Thread.sleep(3000);
	
}
}
