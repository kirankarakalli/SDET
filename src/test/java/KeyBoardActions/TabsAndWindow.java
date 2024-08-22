package KeyBoardActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
			
	   driver.get("https://demo.nopcommerce.com/");
	   
	   driver.switchTo().newWindow(WindowType.TAB);
	   
	   driver.get("https://demo.nopcommerce.com/");

	}

}
