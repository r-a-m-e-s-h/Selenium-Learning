package Basic;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	
	@Test
	public void alert_Test() throws InterruptedException
	{
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement option_btn = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a/i[1]"));
		option_btn.click();
		
		WebElement alert_btn = driver.findElement(By.xpath("//*[@id=\"menuform:m_overlay\"]/a"));
		alert_btn.click();
		
		
		
		WebElement alert1 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		alert1.click();
		
		Thread.sleep(2000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		//org.openqa.selenium.Alert
		//Alert alert = driver.switchTo().alert();
		
		
		alert.accept();
		
		WebElement alert2 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		alert2.click();
		Thread.sleep(2000);
		alert.dismiss();
		
		WebElement alert3 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]"));
		alert3.click(); //
		Thread.sleep(2000);
		
		
		alert.sendKeys("hello");
		alert.accept();
		
		driver.quit();
		
		
		
	}

}
