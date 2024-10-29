package formy_selenium_project;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();
		        try {
		            
		            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		            WebElement openNewWindowButton = driver.findElement(By.id("new-window"));
		            openNewWindowButton.click();

		            String originalWindow = driver.getWindowHandle();

		            Set<String> allWindows = driver.getWindowHandles();

		            for (String windowHandle : allWindows) {
		                if (!windowHandle.equals(originalWindow)) {
		                    driver.switchTo().window(windowHandle);
		                    break;
		                }
		            }

		            System.out.println("New window title: " + driver.getTitle());

		            driver.close();

		            driver.switchTo().window(originalWindow);

		            System.out.println("Back to original window title: " + driver.getTitle());

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            driver.quit();
		        }
		    }


	}
