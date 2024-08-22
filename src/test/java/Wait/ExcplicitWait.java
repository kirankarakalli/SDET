package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExcplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    WebDriver driver=new ChromeDriver();
		    WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			WebElement element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
			element.sendKeys("Admin");
			
			WebElement element1=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")));
			element1.sendKeys("admin123");
			
			WebElement element3=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
			element3.click();
			
			
			
			//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
			
			
			driver.quit();

	}

}
