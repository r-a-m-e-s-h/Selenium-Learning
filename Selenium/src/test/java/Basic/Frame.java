package Basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	
	
	@Test
	public void frame_Test()
	{
		System.out.println("Hello World");
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement opt_btn = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a/i[1]"));
		opt_btn.click();
		
		WebElement frame_btn = driver.findElement(By.xpath("//*[@id=\"menuform:m_frame\"]/a"));
		frame_btn.click();
		
		//Frame1
		driver.switchTo().frame(0);
		
		WebElement frm_btn = driver.findElement(By.xpath("//*[@id=\"Click\"]"));
		frm_btn.click();
		
		
		
		driver.switchTo().defaultContent(); 
		
		//Frame2-Nested_Frame
		
		driver.switchTo().frame(2);
		
		driver.switchTo().frame("frame2");
		
		WebElement f2_btn = driver.findElement(By.xpath("//*[@id=\"Click\"]"));
		f2_btn.click();
		
		driver.switchTo().defaultContent(); 
		
		
		//System.out.println("out");
		
		//Frame3-Counting the frames
		
		
		
		List<WebElement> frame_count = driver.findElements(By.tagName("iframe"));
	     
		System.out.println("The no of frames in the 2nd frame is : "+ frame_count.size());
		
		
		
		
		driver.quit();
		
		
	}

}
