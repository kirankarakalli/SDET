package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.manage().window().maximize();
		
         
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));		
		driver.switchTo().frame(frame1);
		
		
		
		
		WebElement box1=driver.findElement(By.xpath("//*[@id=\"field1\"]"));
		WebElement box2=driver.findElement(By.xpath("//*[@id=\"field2\"]"));
		WebElement button=driver.findElement(By.xpath("/html/body/button"));
		box1.clear();
		
		box1.sendKeys("Kiran");
		Actions act=new Actions(driver);
		
		act.doubleClick(button).build().perform();
		
		
		
	}

}
