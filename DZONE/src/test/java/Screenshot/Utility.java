package Screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Utility {
	public static void ScreenshotTest(WebDriver driver, String homepage)
	{
      try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(src, new File("./Screenshots/" + homepage + ".png"));
	} 
	catch (IOException e) 
      {
		System.out.println("Exception " +e.getMessage());
		e.printStackTrace();
	}
      
	}

	

	 
}
