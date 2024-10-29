package formy_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://formy-project.herokuapp.com/datepicker");
			driver.manage().window().maximize();
			
			 WebElement datePicker = driver.findElement(By.id("datepicker"));
	            datePicker.click();
	            
	            datePicker.sendKeys("10/15/2024");

//			
//			WebElement Datepicker = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
//			Datepicker.click();
			
//			WebElement Monthyear = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[2]"));
//			Monthyear.click();
		
//			WebElement Month = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[1]"));
//			Month.click();
		
//			WebElement Year = driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/tbody/tr/td/span[3]"));
//			Year.click();
		
//			WebElement Day = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[2]/td[1]"));
//			Day.click();
	}

}
