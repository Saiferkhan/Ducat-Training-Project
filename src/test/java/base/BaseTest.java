package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.Log;


public class BaseTest {
	
	protected WebDriver driver;
	public WebDriver getDriver() {	
	return driver;
	
	}

@BeforeMethod
public void setup() {
	
	Log.info("Launching Browser");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@AfterMethod
public void teardown() {
	if(driver!=null) {
		Log.info("Closing Broswer");
		driver.quit();
	}
  }
}

