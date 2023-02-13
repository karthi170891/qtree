package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class adio {

	public static void main(String[] args) throws InterruptedException {
		
		//radio=> only one option can be clicked at a time 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://courses.letskodeit.com/practice");
		
		ob.findElementById("bmwradio").click();
		Thread.sleep(2000);
		

		ob.findElementById("benzradio").click();
		Thread.sleep(2000);
		

		ob.findElementById("hondaradio").click();
		Thread.sleep(2000);
		
	}
}
