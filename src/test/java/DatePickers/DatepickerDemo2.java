package DatePickers;

import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatepickerDemo2 {

    // Method to convert month name string to Month enum
    static Month convertMonth(String month) {
        // Initialize a HashMap to map month names to Month enums
        HashMap<String, Month> monthMap = new HashMap<>();

        // Populate the HashMap with month mappings
        monthMap.put("January", Month.JANUARY);
        monthMap.put("February", Month.FEBRUARY);
        monthMap.put("March", Month.MARCH);
        monthMap.put("April", Month.APRIL);
        monthMap.put("May", Month.MAY);
        monthMap.put("June", Month.JUNE);
        monthMap.put("July", Month.JULY);
        monthMap.put("August", Month.AUGUST);
        monthMap.put("September", Month.SEPTEMBER);
        monthMap.put("October", Month.OCTOBER);
        monthMap.put("November", Month.NOVEMBER);
        monthMap.put("December", Month.DECEMBER);

        // Convert the month string to a Month enum, handling case sensitivity
        Month Vmonth = monthMap.get(month);
        
        if (Vmonth == null) {
            System.out.println("Invalid month: " + month);
            throw new IllegalArgumentException("Invalid month: " + month);
        }

        return Vmonth;
    }

    public static void main(String[] args) {
        // Setup WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        String Year = "2022";
        String Month = "May";
        String Date = "25";

        // Switch to the correct frame
        driver.switchTo().frame("frame-one796456169");

        // Open the date picker
        driver.findElement(By.xpath("//*[@id=\"q4\"]/span")).click();

        // Select the year from the dropdown
        WebElement dropdownYear = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select"));
        Select s = new Select(dropdownYear);
        s.selectByVisibleText(Year);

        // Loop to find the correct month
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span")).getText();
            // Convert month to Month enum object
            Month CMonth = convertMonth(currentMonth);
            Month RMonth = convertMonth(Month);

            // Compare the current month with the required month
            int result = RMonth.compareTo(CMonth);

            if (result < 0) {
                // Click the previous month button
                driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
            } else if (result > 0) {
                // Click the next month button
                driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
            } else {
                break; // Correct month found
            }
        }

        // Select the day from the date picker
        List<WebElement> d=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td/a"));
        
        for(WebElement op:d)
        {
        	if(op.getText().equals(Date))
        	{
        		op.click();
        		break;
        	}
        }

        // Close the driver
        
    }
}
