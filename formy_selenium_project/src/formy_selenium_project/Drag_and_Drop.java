package formy_selenium_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chrome-win64\\chrome-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://formy-project.herokuapp.com/dragdrop");
			driver.manage().window().maximize();

		            try {
		                
		                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		                WebElement image = driver.findElement(By.id("image"));
		                WebElement target = driver.findElement(By.id("box"));

		                Actions actions = new Actions(driver);
		                actions.dragAndDrop(image, target).perform();

		                Thread.sleep(2000); 

		            } catch (Exception e) {
		                e.printStackTrace();
		            } finally {

		                driver.quit();
		            }
		        }
		    
	}

