package Day39;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> linkElement=driver.findElements(By.tagName("a"));
		
		for(WebElement link:linkElement)
		{
			String href=link.getAttribute("href");
			if(href==null || href.isEmpty())
			{
				System.out.println("href has null or empty");
				continue;
			}
			
			try {
				URL linkURL=new URL(href);
				HttpURLConnection conn=(HttpURLConnection) linkURL.openConnection();
				conn.connect();
				if(conn.getResponseCode()>=400)
				{
					System.out.println(href+"broken link");
				}
				else
				{
					System.out.println(href+"not broken link");
					
				}
				
				
				
				
			} catch (Exception e) {
				
				
			}
		}

	}

}
