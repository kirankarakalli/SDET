package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new EdgeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			//input[@placeholder='Password']
			//Login steps
			driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			//click PIM
			driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
			
			//opening dropdown
			driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']")).click();
			Thread.sleep(5000);
			//selecting one option
			//driver.findElement(By.xpath("//span[normalize-space()='Finance Manager']")).click();
			
			
			
		   
			List<WebElement> options=driver.findElements(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']/div"));
			
			System.out.println(options.size());
			
			//printing all options
			
			
			for(WebElement text:options )
			{
				System.out.println(text.getText());
			}
			

	}

}
