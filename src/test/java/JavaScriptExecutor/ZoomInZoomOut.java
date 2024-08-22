package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	       driver.get("https://testautomationpractice.blogspot.com/");
	       driver.manage().window().maximize();
	       
	       JavascriptExecutor js=(JavascriptExecutor) driver;
	       
	       js.executeScript("document.body.style.zoom='50%'");

	}

}
