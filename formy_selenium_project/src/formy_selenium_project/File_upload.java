package formy_selenium_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/fileupload");
		driver.manage().window().maximize();
		

		        try {

		            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		            WebElement fileUploadElement = driver.findElement(By.id("file-upload-field"));

		            String filePath = "path/to/your/file.txt";

		            fileUploadElement.sendKeys(filePath);

		            Thread.sleep(2000); 

		            WebElement successMessage = driver.findElement(By.id("success"));
		            if (successMessage.isDisplayed()) {
		                System.out.println("File uploaded successfully!");
		            }

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		           
		            driver.quit();
		        }
		    }
		}


