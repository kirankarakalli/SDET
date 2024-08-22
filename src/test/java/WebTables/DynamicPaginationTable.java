package WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
		
		
		
		
	
		//entering username
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.click();
		
		
		//enter password
		WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.click();
		
		
		//click login button
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		//clear messgae box
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
			
		}
		
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		//getting number of pages
		String text=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		int pages=Integer.parseInt(text.substring(text.indexOf('(')+1,text.indexOf("Pages")-1));
		
	    //clicking all pages 
		
		for(int p=1;p<=pages;p++)
		{
			if(p>1)
			{
				WebElement page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				page.click();
			}
			
			int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			
			
			for(int i=1;i<=rows;i++)
			{
				String customer=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[2]")).getText();
				
			}
		}
		
		
		//find no of rows
		
		
		
		
		

	}

}
