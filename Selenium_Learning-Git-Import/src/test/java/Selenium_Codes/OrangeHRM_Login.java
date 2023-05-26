package Selenium_Codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_Login {
	
	@Test
	public void login()
	{
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("Admin");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("Admin1234");
		
		
	}

}
