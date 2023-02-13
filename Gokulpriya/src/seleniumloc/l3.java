package seleniumloc;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l3 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.google.com");
	
	// tagname: cannot be used to find single element
	
	// images : img
	// links  : a
	// elements: div, input...
	
	List<WebElement> i = ob.findElementsByTagName("img");
	System.out.println("Number of images "+ i.size());
	

	List<WebElement> i1 = ob.findElementsByTagName("a");
	System.out.println("Number of links "+ i1.size());
	
	

	List<WebElement> i2 = ob.findElementsByTagName("div");
	System.out.println("Number of elemnts  with div tag "+ i2.size());
	
	ob.quit();
}
}
