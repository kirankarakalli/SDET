package ChromeOptions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class addingselectorshuextension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\EI13593\\Downloads\\SelectorsHub-Chrome-Web-Store.crx"));
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

	}

}
