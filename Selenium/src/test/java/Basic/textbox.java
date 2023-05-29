package Basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textbox {
	
	@Test
	public void txxtbox_test() throws InterruptedException
	{
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement optn_btn = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
		optn_btn.click();
		
		WebElement txtbox_btn = driver.findElement(By.xpath("//*[@id=\"menuform:m_input\"]/a"));
		txtbox_btn.click();
		
		WebElement t1 = driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
		t1.sendKeys("Tom Jerry");
		
		WebElement t2 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		t2.sendKeys(" Hello");
		
		WebElement t3 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		boolean status  = t3.isEnabled();
		if(status!=true)
		{
			System.out.println("The txtbos id Disabled");
		}
		
		WebElement t4 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
		t4.clear();
		System.out.println("The Text is Cleared ");
		
		WebElement t5 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
		String t5_txt = t5.getText();
		System.out.println("The text is : "+t5_txt);
		
		WebElement t6 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]"));
		t6.sendKeys("Im an Automation Tester ");
		
		WebElement t7 = driver.findElement(By.xpath("//*[@id=\"j_idt106:thisform:age\"]"));
		t7.sendKeys(Keys.ENTER);
		System.out.println("The Enter key is presssed ");
		
		Thread.sleep(1000);
		
		WebElement keyBoard = driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt122\"]"));
		keyBoard.click();
		Thread.sleep(1000);
		
		WebElement keyboard_sts = driver.findElement(By.xpath("/html/body/div[4]"));
		boolean keyboard_status = keyboard_sts.isEnabled();
		if(keyboard_status=true)
		{
		System.out.println("Keboard is Displayed");
		}
		
		Thread.sleep(1000);
		
		WebElement select_textbox = driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete\"]")); 
		select_textbox.sendKeys("Ram");
		System.out.println(" Enterd ");
		
//		List<WebElement> ex = driver.findElements(By.xpath("//*[@id=\"j_idt106:auto-complete_panel\"]/ul/li"));
//		WebElement txt1 = ex.get(3);
//		System.out.println(" The 3rd txt is : "+ txt1.getText());
		
		driver.quit();
		
		
		
		
		
	}

}
