package HnadlingCheckBoxAndAlerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();  --selecting specfic checkbix
		
		//selecting all checkboxes
		
		List<WebElement> list= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		/*for(int i=0;i<list.size();i++)
		{
			list.get(i).click();
		}
		*/
		
		//selecting last 3 checkboxes
		
		/*for(int i=list.size()-3;i<list.size();i++)
		{
			list.get(i).click();
		}
		*/
		
		//selecting first 3 checkboxes
		
		for(int i=0;i<3;i++)
		{
			list.get(i).click();
		}
		
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).isSelected()==true)
			{
				list.get(i).click();
			}
		}
		
		
		
		
		
		//driver.quit();

	}

}
