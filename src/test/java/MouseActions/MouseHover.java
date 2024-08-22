package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement element=driver.findElement(By.xpath("//span[@id='blogsmenu']"));
		
		WebElement element1=driver.findElement(By.xpath("//span[normalize-space()='Selenium143']"));
		
		act.moveToElement(element).moveToElement(element1).click().build().perform();
		
		
	}

}
