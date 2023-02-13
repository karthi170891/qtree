package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class d1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.google.com");
	
	Set<Cookie> s = ob.manage().getCookies();
	System.out.println("Numer of cookie befre deletion "+ s.size());
	ob.manage().deleteAllCookies();
	
	Set<Cookie> s1 = ob.manage().getCookies();
	System.out.println("Numer of cookie after del"+ s1.size());
	
	ob.quit();
}
}
