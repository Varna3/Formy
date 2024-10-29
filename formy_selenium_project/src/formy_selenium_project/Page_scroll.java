package formy_selenium_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/scroll");
		driver.manage().window().maximize();
		
			        try {
		           
		            driver.get("https://formy-project.herokuapp.com/scroll");

		            driver.manage().window().maximize();

		            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		            WebElement FullName = driver.findElement(By.id("first-name"));
		            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",FullName);
		            FullName.sendKeys("Varna venugopan");

		            
		            WebElement Date = driver.findElement(By.id("job-title"));
		            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Date);
		            Date.sendKeys("02/15/2024");


		            Thread.sleep(2000);

		        } catch (Exception e) {
		        	 e.printStackTrace();
		        } finally {
		          
		            driver.quit();
		        }
		    }
		}

