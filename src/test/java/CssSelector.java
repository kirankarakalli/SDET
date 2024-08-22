import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iphone");--tag#id
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");---tag.classname
		
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\" ]")).sendKeys("T-shirts");---tag attribute
		driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("T-shirts");
		
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		driver.quit();
		
		

	}

}
