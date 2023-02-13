package seleniumloc;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {
	public static void main(String[] args) throws InterruptedException {
		
		/*8 locators
		 * 
		 * id
		 * name
		 * classname: not preferrable 
		 * 
		 * linktext
		 * partial linktext
		 * tagname
		 * 
		 * xpath
		 * css 
		 * 
* 
		 * */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://geoconnect-qa.azurewebsites.net/");
		Thread.sleep(4000);
		
		ob.findElementByXPath("/html/body/app-root/app-login/div/div/div[2]/form/div[1]/span/input").sendKeys("hi");
	    ob.findElementByCssSelector("#password1 > div > input").sendKeys("hi");
	    ob.findElementByXPath("/html/body/app-root/app-login/div/div/div[2]/form/button/span[2]").click();
	
	}

}
