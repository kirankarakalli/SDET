package Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takefullpage {

	public static void main(String[] args) {
     
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		File Targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		
		sourcefile.renameTo(Targetfile);
		driver.quit();
		
		
		


	}

}
