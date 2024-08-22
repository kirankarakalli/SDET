package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		//minslider
		WebElement min_slider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.println(min_slider.getLocation());
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 249).build().perform();
		System.out.println(min_slider.getLocation());
		
		
		//Maxslider
		
		WebElement max_slider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		System.out.println(max_slider.getLocation());
		
		act.dragAndDropBy(max_slider, -100, 249).build().perform();
		System.out.println(max_slider.getLocation());
		
		driver.quit();

	}

}
