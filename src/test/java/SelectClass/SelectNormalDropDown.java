package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectNormalDropDown {

	public static void main(String[] args) {
		
		
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
		
	WebElement dropdowncountryEle=driver.findElement(By.xpath("//select[@id='country']"));
	
	Select s=new Select(dropdowncountryEle);
	s.selectByVisibleText("France");
	
	s.selectByValue("france");
	
	s.selectByIndex(1);
	
	
	List<WebElement> list=s.getOptions();
	
	for(WebElement name:list)
	{
		System.out.println(name.getText());
	}
	
	
	

	}

}
