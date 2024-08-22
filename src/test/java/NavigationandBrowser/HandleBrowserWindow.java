package NavigationandBrowser;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> wids=driver.getWindowHandles();		
		
		List<String> list=new ArrayList(wids);
		
		String parent=list.get(0);
		
		String child=list.get(1);

		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child);
		
		System.out.println(driver.getTitle());
		
		for(String wid:wids)
		{
			String title=driver.switchTo().window(wid).getTitle();
			
			System.out.println(title);
		}
		
		
		
		
		driver.quit();

	}

}
