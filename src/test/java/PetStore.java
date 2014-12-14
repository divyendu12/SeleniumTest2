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
	public void LaunchTest()
	{
		driver.get("http://127.0.0.1:8081/JpetStore/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void ClickLink()
	{
		driver.findElement(By.xpath("//*[@id='Content']/p[1]")).click();
	}
	
	@AfterTest
	
	public void Close()
	{
		driver.quit();
	}
}
