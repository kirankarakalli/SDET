import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		element.sendKeys("selenium");
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"wikipedia-search-result-link\"]"));
		
		System.out.println(list.size());
		
		
		List<WebElement> list1=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		
		for(WebElement l:list1)
		{
			l.click();
		}
	
		
		Set<String> wids=driver.getWindowHandles();
		
		
		
		
		//driver.quit();
		

	}

}
