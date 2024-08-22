package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://testautomationpractice.blogspot.com/");
       driver.manage().window().maximize();
       
       JavascriptExecutor js=(JavascriptExecutor) driver;
		
       //scrollby pixels
       js.executeScript("window.scrollBy(0,1000)"," ");
       System.out.println(js.executeScript("return window.pageYOffset"," "));
		
       //scroll till element is visible
       WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='Web Table']"));
       js.executeScript("arguments[0].scrollIntoView()",ele);
       System.out.println(js.executeScript("return window.pageYOffset"," "));
       
       //scroll page till end of document
       
       js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       System.out.println(js.executeScript("return window.pageYOffset"," "));
       
       //scroll upto initial position
       
       js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
       System.out.println(js.executeScript("return window.pageYOffset"," "));
	}

}
