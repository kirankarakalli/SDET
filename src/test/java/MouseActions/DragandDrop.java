package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		

		
		
		
		WebElement Madrid=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement spain=driver.findElement(By.xpath("//div[@id='box107']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(Madrid, spain).perform();

	}

}
