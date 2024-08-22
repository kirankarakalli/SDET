package NavigationandBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://omayo.blogspot.com/");
		
		driver.navigate().to("https://www.w3schools.com/html/default.asp");
		
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		driver.quit();

	}

}
