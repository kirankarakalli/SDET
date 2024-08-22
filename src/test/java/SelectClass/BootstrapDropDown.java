package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//selecting single option
	//	driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/ul/li[8]/a/label/input")).click();
		
		
		//selecting all options
		
		List<WebElement> option=driver.findElements(By.xpath("//button[contains(@class,'multiselect')]//option"));
		
		System.out.println(option.size());
		
		
		//printing all options
		for(WebElement list:option)
		{
			System.out.println(list.getText());
		}
		
		
		//selecting specific option in dropdown
		for(WebElement op:option)
		{
			if(op.equals("java"))
			{
				op.click();
			}
		}
		
		
		
		
	}

}
