package formy_selenium_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		driver.manage().window().maximize();
          try {
		           
		            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		            WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
		            radioButton1.click();
		            WebElement submitButton = driver.findElement(By.xpath("//a[text()='Submit']"));
		            submitButton.click();

		            Thread.sleep(2000);

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		       
		        	driver.quit();
		        }
		    }
		}
