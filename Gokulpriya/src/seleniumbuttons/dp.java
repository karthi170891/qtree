package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class dp {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/datepicker/");
		
		ob.switchTo().frame(0);
		
		ob.findElementById("datepicker").click();
		
		for(int i=0;i<2;i++)
		{
			ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]").click();
		}
		
		ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[7]/a").click();
		
		Thread.sleep(3000);
	}

}

