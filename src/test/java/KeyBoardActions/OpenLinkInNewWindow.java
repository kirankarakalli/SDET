package KeyBoardActions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewWindow {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement register=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).perform();
		register.click();
		act.keyUp(Keys.CONTROL).perform();
		
	    List<String> ids=new ArrayList( driver.getWindowHandles());
	    
	    String child=ids.get(1);
	    
	    driver.switchTo().window(child);
	    
	    driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Kiran");
	    
	    driver.switchTo().window(ids.get(0));
	    
	    driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T_shirts");
		
		

	}

}
