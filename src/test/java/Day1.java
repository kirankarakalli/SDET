import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("search")).sendKeys("iphone");
		//boolean name=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.print(name);
		
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Table")).click();
		
		//List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
		//System.out.print(headerlinks.size());
		
		
		//List<WebElement> headerlinks1=driver.findElements(By.tagName("img"));
		//System.out.print(headerlinks1.size());
		
		driver.quit();

	}

}
