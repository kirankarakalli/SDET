package HnadlingCheckBoxAndAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		//Normal ALert with ok button
		/*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert myalert=driver.switchTo().alert();
		System.out.print(myalert.getText());
		Thread.sleep(5000);
		myalert.accept();
		*/
		
		
		//confirmation alert
		
		/*driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert myalert1=driver.switchTo().alert();
		Thread.sleep(5000);
		myalert1.dismiss();
		*/
		
		//prompt alert
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert myalert2=driver.switchTo().alert();
		
		myalert2.sendKeys("welcome");
		Thread.sleep(5000);
		myalert2.accept();
		
		
		
		driver.quit();
		

	}

}
