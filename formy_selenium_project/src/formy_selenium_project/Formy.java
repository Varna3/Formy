package formy_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formy {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		driver.manage().window().maximize();
		
		WebElement Address = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		Address.sendKeys("Karukyil");

		WebElement Streetaddress = driver.findElement(By.xpath("//*[@id=\"street_number\"]"));
		Streetaddress.sendKeys("Karukyil ward");
		
		WebElement Streetaddress2 = driver.findElement(By.xpath("//*[@id=\"route\"]"));
		Streetaddress2.sendKeys("Avalookunnu");
		
		WebElement City = driver.findElement(By.xpath("//*[@id=\"locality\"]"));
		City.sendKeys("Alappuzha");
		
		WebElement State = driver.findElement(By.xpath("//*[@id=\"administrative_area_level_1\"]"));
		State.sendKeys("Kerala");
		
		WebElement Zipcode = driver.findElement(By.xpath("//*[@id=\"postal_code\"]"));
		Zipcode.sendKeys("688006");
		
		WebElement Country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Country.sendKeys("India");
	}

}
