package DatePickers;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickers {
	
	public static void SelectFutureDate(WebDriver driver,String Year,String Month,String Date)
	{
		while(true)
		{
			String CurrentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String CurrentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(CurrentMonth.equals(Month) && CurrentYear.equals(Year))
			{
				break;
				
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			
		}
		
		//select date
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		
		for(WebElement d:dates)
		{
			if(d.getText().equals(Date))
			{
				d.click();
			}
		}
		
	}
	
	public static void SelectPastDate(WebDriver driver,String Year,String Month,String Date)
	{
		while(true)
		{
			String CurrentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String CurrentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(CurrentMonth.equals(Month) && CurrentYear.equals(Year))
			{
				break;
				
			}
			else
			{
				driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-circle-triangle-w'])[1]")).click();
			}
			
		}
		
		//select date
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		
		for(WebElement d:dates)
		{
			if(d.getText().equals(Date))
			{
				d.click();
			}
		}
		
		
		
		
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//method1:using sendkeys
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("24/07/2024");
		
		//method2:using datepicker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String Year="2023";
		String Month="August";
		String Date="25";
		
		//select month and year
		
		//SelectFutureDate(driver,Year,Month,Date);
		SelectPastDate(driver,Year,Month,Date);
		

	}

}
