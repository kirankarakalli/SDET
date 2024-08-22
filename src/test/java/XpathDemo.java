import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		//xapth with single attribute
		//driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("iphone");
		
		//xpath with multiple attributes
		
		//driver.findElement(By.xpath("//input[@type='text'][@name='q']")).sendKeys("iphone");
		
		//driver.findElement(By.xpath("//input[@type='text' and @name='q']")).sendKeys("iphone");  --and operator
		
		//driver.findElement(By.xpath("//input[@type='text' or @name='q']")).sendKeys("iphone");  --or operator
		
		//driver.findElement(By.xpath("//a[text()='http://www.Selenium143.blogspot.com']")).click();  --using text method
		
		//driver.findElement(By.xpath("//span[contains(@id,'home')]")).click();  --using contains method
		
		//driver.findElement(By.xpath("//span[starts-with(@id,'ho')]")).click();
		
		driver.findElement(By.xpath("//div[@class='widget-content']/form/input")).sendKeys("kiran"); //using chained xpath
		
		
		
		
		
		
		driver.quit();
		
		

	}

}
