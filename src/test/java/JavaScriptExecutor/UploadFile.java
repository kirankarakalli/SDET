package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	       driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	       driver.manage().window().maximize();
	       
	       //file  upload single file
	      /* driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\EI13593\\OneDrive - Tietoevry\\Desktop\\Test Case Template.png");
	       if(driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText().equals("Test Case Template.png"))
	       {
	    	   System.out.print("file uploaded succesfully");
	       }
	       else
	       {
	    	   System.out.print("file upload failed");
	       }
*/
	       
	       
	       //upload multiple file
	       
	       String file1="C:\\Users\\EI13593\\OneDrive - Tietoevry\\Desktop\\Test Metrics.png";
	       String file2="C:\\Users\\EI13593\\OneDrive - Tietoevry\\Desktop\\Test Metrics1.png";
	       driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+'\n'+file2);
	       
	       int files=  driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();
	       
	       if(files==2)
	       {
	    	   System.out.print("files uploaded");
	       }
	       else
	       {
	    	   System.out.print("files upload failed");
	       }
	       
	       
	    		   
	}

}
