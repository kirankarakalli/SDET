package HnadlingCheckBoxAndAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticatedPopUp {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.quit();
		
		

	}

}
