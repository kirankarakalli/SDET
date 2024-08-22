package WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		for(int p=1;p<=4;p++)
		{
			if(p>1)
			{
				WebElement page=driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]"));
				page.click();
			}
			 int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
				
				for(int i=1;i<=rows;i++)
				{
					String product=driver.findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td[2]")).getText();
					driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td[4]//input")).click();
					System.out.println(product);
					
				}
		}

	}

}
