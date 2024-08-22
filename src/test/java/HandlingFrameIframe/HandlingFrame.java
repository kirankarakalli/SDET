package HandlingFrameIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Switch to frame1
		
		WebElement frame1=driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("frame1");
		
		//switch to parent frame;
		driver.switchTo().defaultContent();
		
		
		//switch to frame2
		WebElement frame2=driver.findElement(By.xpath(" //frameset//frameset//frame[1]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("frame2");
		
		
		driver.switchTo().defaultContent();
		
		
		//switch to frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("frame3");
		
		//switching to inneframe
		driver.switchTo().frame(0);
		
		
		//clicking innerframe button
		driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
		

	}

}
