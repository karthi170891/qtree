package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderr {
public static void main(String[] args) {
	
	//horizontal slider : move along x axis
	// vertical slider; move along y axis, x value will be 0
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("https://jqueryui.com/slider/");
	ob.switchTo().frame(0);
	Actions ac= new Actions(ob);
	WebElement ele = ob.findElementById("slider");
	ac.dragAndDropBy(ele, 40, 0).build().perform();
	
}
}
