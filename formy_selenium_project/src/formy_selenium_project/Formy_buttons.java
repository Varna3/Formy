package formy_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formy_buttons {

	public static void main(String[] args) throws InterruptedException
	{
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/buttons");
		driver.manage().window().maximize();
		
		WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"btnGroupDrop1\"]"));
		Dropdown.click();
		
		
		WebElement Dropdownlink1 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[1]"));
		Thread.sleep(3000);
		Dropdownlink1.click();
		
		
//		WebElement Dropdownlink2 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[2]"));
//		Thread.sleep(3000);
//		Dropdownlink2.click();
		
		

	}

	
}
