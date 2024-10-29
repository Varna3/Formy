package formy_selenium_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_and_mouse_press {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/keypress");
		driver.manage().window().maximize();
		
		try {
       
            driver.get("https://formy-project.herokuapp.com/keypress");

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            WebElement inputField = driver.findElement(By.id("name"));

            inputField.click();

            Actions actions = new Actions(driver);

            actions.sendKeys("Hello World!").perform();

            Thread.sleep(2000); 
            String displayedText = inputField.getAttribute("value");
            System.out.println("Displayed text: " + displayedText);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          
            driver.quit();
        }
    }

		
		
	}


