package seleniumloc;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ki {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.google.com");
	

	

	List<WebElement> i1 = ob.findElementsByTagName("a");
	System.out.println("Number of links "+ i1.size());
	
	//for(datatype tempvariable: nameofthecollection)
	
	for(WebElement x: i1)
	{
		System.out.println(x.getAttribute("href"));
	}
	
	ob.quit();
}
}
