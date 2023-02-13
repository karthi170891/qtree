package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/droppable/");
		
		// webelelements=> present inside the frame
		// switch your control to that frame
		// id index, name
		ob.switchTo().frame(0);
		
		Actions ac = new Actions(ob);
		WebElement ele1 = ob.findElementById("draggable");
		WebElement ele2 = ob.findElementById("droppable");
		ac.dragAndDrop(ele1, ele2).build().perform();
	}
}
