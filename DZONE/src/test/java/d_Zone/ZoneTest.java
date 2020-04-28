//Object Repository, Log4j, screenshots,Maven, Testng, total number of links in the webpage, broken links, git

package d_Zone;



import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Configurations.ConfigReaderTest;
import Screenshot.Utility;

public class ZoneTest 
{
	WebDriver driver;
	@Test
	
	public void browser() 
	{
		Logger log= Logger.getLogger(ZoneTest.class);
      ConfigReaderTest config = new ConfigReaderTest();
      log.info("Installing gecko driver");
      System.setProperty("webdriver.gecko.driver", config.firefox());
      driver= new FirefoxDriver();
      driver.get(config.URL());
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      Utility.ScreenshotTest(driver, "homepage1");
      
      
	}
}
