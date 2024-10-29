package formy_selenium_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/modal");
		driver.manage().window().maximize();
		
		try {
		            
		            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		            
		            WebElement launchModalButton = driver.findElement(By.id("modal-button"));
		            launchModalButton.click();

		            Thread.sleep(2000);

		            WebElement nameInput = driver.findElement(By.id("name"));
		            nameInput.sendKeys("John Doe");

		            WebElement jobInput = driver.findElement(By.id("job"));
		            jobInput.sendKeys("Software Engineer");

		            WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		            submitButton.click();

		            Thread.sleep(2000);

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		           
		            driver.quit();
		        }
		    }
	}

