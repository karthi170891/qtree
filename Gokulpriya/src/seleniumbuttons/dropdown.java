package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("https://courses.letskodeit.com/practice");
	
	// create an object for select class
	// pass dropdown box as input to the select object
	
	// index, value or visible text
	// at a time only one option can be selected
	WebElement ele = ob.findElementById("carselect");
	Select s= new Select(ele);
	//s.selectByIndex(1);
	//s.selectByValue("honda");
	s.selectByVisibleText("Benz");
}
}
