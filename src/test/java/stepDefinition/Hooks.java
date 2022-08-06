package stepDefinition;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Hooks extends AbstractTestNGCucumberTests
{
public static WebDriver driver ; 
	
@Before
	public void startDriver()
	{

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		/* >>	Write it like this with Selenium 4	<<*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to("http://demo.nopcommerce.com/");
	} 

@After
	public void stopDriver() 
	{
		driver.quit();
	}

	}
