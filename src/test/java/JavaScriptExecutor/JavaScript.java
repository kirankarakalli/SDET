package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//sendkeys using javascript exceutor
		WebElement sendkey=driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js=driver;
		js.executeScript("arguments[0].setAttribute('value','john')",sendkey);
		
		WebElement clic=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",clic);
		
		

	}

}
