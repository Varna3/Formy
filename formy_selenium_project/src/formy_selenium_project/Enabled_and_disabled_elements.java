package formy_selenium_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled_and_disabled_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://formy-project.herokuapp.com/enabled");
			driver.manage().window().maximize();
			
	
			        try {
			            

			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            WebElement inputField = driver.findElement(By.id("input"));
			            inputField.sendKeys("Hello World!");

			            WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
			            submitButton.click();

			            Thread.sleep(2000); 

			            WebElement successMessage = driver.findElement(By.id("success"));
			            if (successMessage.isDisplayed()) {
			                System.out.println("Form submitted successfully!");
			            }

			        } catch (Exception e) {
			            e.printStackTrace();
			        } finally {
			            
			            driver.quit();
			        }
			    }
		
				
			
			
			

	}

