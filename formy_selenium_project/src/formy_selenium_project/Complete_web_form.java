package formy_selenium_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Complete_web_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		        try {
		            
		            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		            driver.findElement(By.id("first-name")).sendKeys("Varna");
		            driver.findElement(By.id("last-name")).sendKeys("Venugopan");
		            driver.findElement(By.id("job-title")).sendKeys("Software Tester");

		            driver.findElement(By.id("radio-button-2")).click();
		            driver.findElement(By.id("checkbox-2")).click(); 
		            driver.findElement(By.id("datepicker")).sendKeys("10/26/2024");
		            driver.findElement(By.xpath("//a[text()='Submit']")).click();

		            Thread.sleep(2000);

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		          
		          driver.quit();
		        }
		    }
		

	}


