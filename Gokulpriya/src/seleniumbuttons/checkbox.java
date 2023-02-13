package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://courses.letskodeit.com/practice");
		
		ob.findElementById("bmwcheck").click();
		Thread.sleep(2000);
		

		ob.findElementById("benzcheck").click();
		Thread.sleep(2000);
		

		ob.findElementById("hondacheck").click();
		Thread.sleep(2000);

	}
}
