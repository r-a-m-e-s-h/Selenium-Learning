package Selenium_Codes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Google {

	
	@Test
	public void OpenGoogle()
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Hello World"+Keys.ENTER);
		
		//driver.quit();
		
		
		
		
	}
}
