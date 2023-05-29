package Basic;                                   
                                                 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;            
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.annotations.Test;              
                                                 
import io.github.bonigarcia.wdm.WebDriverManager;
                                                 
public class OpenChrome {                        
	                                                
	@Test                                           
	public void t1()                                
	{                                               
	                                                
	WebDriver driver;                               
	                                                
	WebDriverManager.chromedriver().setup();        
	                                                
	driver = new ChromeDriver();  
	
	driver.get("http://www.google.co.in");
	
	driver.findElement(By.name("q")).sendKeys("Hello world"+Keys.ENTER);
	
	driver.quit();
	                                                
	                                                
	                                                
	}                                               
                                                 
}                                                
                                                 