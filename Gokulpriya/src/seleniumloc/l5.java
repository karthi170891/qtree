package seleniumloc;

import org.openqa.selenium.chrome.ChromeDriver;

public class l5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.mycontactform.com");
	/*
	 * xpath: xml path language
	 * 
	 * relative
	 * absolute 
	 * 
	 * absolute xpath: findng the element from the root to the desired element
	 *                 starts with /
	 *                 copy=> full xpath 
	 *                 /html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input
	 * 
	 * 
	 * relative xpath: starts with //
	 *   
	 *         syntax:   //*[@loc/attribute='value']
	 *         shortcut: copy=> copy xpath
	 *     
	 *    * 
	 * */
	
	//locator:id-user
	ob.findElementByXPath("//*[@id='user']").sendKeys("Dhivyakarthi123");
	
	//attribute: type=password
	ob.findElementByXPath("//*[@type='password']").sendKeys("12345");
	
	// copy=> copy xpath
	//ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
	
	ob.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/div/input").click();
}
}
