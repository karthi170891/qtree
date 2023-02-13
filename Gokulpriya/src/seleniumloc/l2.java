package seleniumloc;

import org.openqa.selenium.chrome.ChromeDriver;

public class l2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.google.com");
	
	//linktext:  word/group of words=> click on it=> a new url will be opened
	// partial linktext: substring of linktext
	
	
	
	//Privacy
	//ob.findElementByLinkText("Privacy").click();
	
	ob.findElementByPartialLinkText("Pri").click();
}
}
