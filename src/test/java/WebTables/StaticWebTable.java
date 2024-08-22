package WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Total number of rows
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("No of rows"+rows);
		
		//Total number of cols
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("No of columns"+cols);
		
		//reading specific data from row and column
		String name=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(name);
		
		
		//reading whole table
		for(int i=2;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(data+"\t");
			}
			
			System.out.println();
		}
		
		
		
		//Reading bookname whose authorname is mukesh
		
		
		for(int i=2;i<=rows;i++)
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
			
			if(author.equals("Mukesh"))
			{
				String book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
				
				System.out.println(author+"\t"+book);
			}
		}
		
		//find total price of books
		int total=0;
		for(int i=2;i<=rows;i++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
			
			total+=Integer.parseInt(price);
			
		}
		
		System.out.println(total);
		

	}

}
