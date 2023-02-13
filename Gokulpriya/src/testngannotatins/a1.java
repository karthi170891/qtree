package testngannotatins;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	
	/*
	 * before test :  run only once before all the test cases started its executin
	 * after test  : run only once after all the test cases finished its execution
	 * 
	 * before class: run only once after before test 
	 * after class:  run only once before after test 
	 * 
	 * before method:  run before each test case
	 * after method:  run after each test case 
	 * 
	 * before test: visiting
	 *  before class: max
	 *     before method: refresh   tc1: title   aftermethod : cookies deletion
	 *     before method: refresh  tc2 : clicking  aftermethod: cookies deletion
	 *  after class: gett url
	 * after test : closing 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	ChromeDriver ob;
	@Test
	public void t1()
	{
		System.out.println("Tc1" + ob.getTitle());
	}
	
	@BeforeTest
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 ob= new ChromeDriver();
				  ob.get("http://www.google.com");//step1
		System.out.println("before test");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("before class");
		ob.manage().window().maximize();
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class");
		System.out.println(ob.getCurrentUrl());
	}
	@AfterTest
	public void at() throws InterruptedException
	{
		System.out.println("after test");
		Thread.sleep(3000);
		ob.quit();
	}
	@Test
	public void t2()
	{
		System.out.println("tc2");
		ob.findElementByLinkText("Privacy").click();
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method");
		ob.navigate().refresh();
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("aftermethod");
		ob.manage().deleteAllCookies();
	}
	
}
