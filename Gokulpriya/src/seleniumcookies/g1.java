package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.google.com");
	
	Set<Cookie> s = ob.manage().getCookies();
	System.out.println("Numer of cookie "+ s.size());
	
	for(Cookie x:s)
	{
		System.out.println(x.getName());
		System.out.println(x.getValue());
		System.out.println(x.getExpiry());
		System.out.println();
	}
	
	ob.quit();
}
}
