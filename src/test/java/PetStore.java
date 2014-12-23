import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PetStore {
	
	WebDriver driver;
	
	@BeforeTest
	public void start()
	{
		driver =new FirefoxDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void LaunchTest() throws InterruptedException 
	{
		
		driver.get("http://127.0.0.1:8081/JpetStore/");
		Thread.sleep(1000);
		//driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.SECONDS);
		Thread.sleep(10000);
	}
	/*@Test
	public void ClickLink()
	{
		
		
	}*/
	
	@AfterTest
	
	public void Close()
	{
		driver.quit();
	}
}
