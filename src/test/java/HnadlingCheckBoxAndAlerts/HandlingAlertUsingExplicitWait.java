package HnadlingCheckBoxAndAlerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert myalert2=wait.until(ExpectedConditions.alertIsPresent());
		myalert2.sendKeys("welcome");
		Thread.sleep(5000);
		myalert2.accept();
		
		
		
		//driver.quit();

	}

}
