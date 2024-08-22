package Day39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadowdom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//This Element is inside single shadow DOM.
		WebDriver driver =new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		
	
		Thread.sleep(1000);
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("selenium");
		
	

	}

}
