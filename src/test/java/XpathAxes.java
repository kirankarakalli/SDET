import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		
		
		
		List<WebElement> l1=driver.findElements(By.xpath("//*[@class='product-rating-box']/parent::div[1]"));
		
		System.out.print(l1.size());
		
		
		
		driver.quit();
		
		
		

	}

}
