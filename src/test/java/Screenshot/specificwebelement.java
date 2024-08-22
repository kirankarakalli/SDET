package Screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class specificwebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		  WebElement element=	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
			 File sourcefile= element.getScreenshotAs(OutputType.FILE);
			 
			 File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\specificWebpage.png");
			  sourcefile.renameTo(targetfile);
			  driver.quit();

	}

}
