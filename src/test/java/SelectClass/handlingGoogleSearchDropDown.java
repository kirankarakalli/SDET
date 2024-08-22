package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingGoogleSearchDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//div[@id='Alh6id']//li
		
		
		//div[@id='Alh6id']//li//div[@role='option']
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(5000);
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='Alh6id']//li//div[@role='option']"));
		
		System.out.print(list.size());
		
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("selenium ide"))
			{
				list.get(i).click();
				break;
			}
		}
		
		
		
	}

}
