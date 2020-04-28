package Configurations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderTest {
	Properties pro;
	public ConfigReaderTest()
	{
		
		try {
			File src = new File("C:\\Program Files\\Selenium\\Spring tool suite\\Code\\DZONE\\src\\main\\resources\\Configurations\\Configuration.properties");
			FileInputStream fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
		} 
		catch (IOException e) 
		{
			System.out.println("Exception = "+e.getMessage());
			e.printStackTrace();
		}
	}
	public String chromepath()
	{
	String path= pro.getProperty("ChromeDriver");
		return path;
	}
	
	public String URL()
	{
		String getURL = pro.getProperty("URL");
		return getURL;
	}
	
	public String firefox()
	{
		String FireFoxDriver=pro.getProperty("FirefoxDriver");
		return FireFoxDriver;
	}
}
