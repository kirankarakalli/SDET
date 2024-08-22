package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(element).build().perform();
		
		driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
		
		driver.switchTo().alert().accept();

	}

}
