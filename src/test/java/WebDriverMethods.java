import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getWindowHandle());
		
	//	System.out.println(driver.getPageSource());
		
		boolean status=driver.findElement(By.id("home")).isDisplayed();
		
		System.out.print(status);
		
		
	    boolean status1=driver.findElement(By.id("home")).isEnabled();
		
		System.out.println(status1);
		
		  
		boolean status2=driver.findElement(By.id("radio1")).isSelected();
		
		System.out.println(status2);		
		driver.quit();
		
	

	}

}
