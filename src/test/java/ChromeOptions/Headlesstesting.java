package ChromeOptions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesstesting {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement element=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		element.sendKeys("selenium");
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"wikipedia-search-result-link\"]"));
		
		System.out.print(list.size());
		
		driver.quit();

	}

}
