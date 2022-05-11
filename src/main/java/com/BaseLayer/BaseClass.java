package com.BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	public BaseClass()
	{
	   prop=new Properties();
	   try {
	 	FileInputStream fis=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\OrangeHRMTest\\src\\main\\java\\com\\Config\\config.properties");
		prop.load(fis);
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	}
	public static void Intialization()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\softeck\\automation\\chrome\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("implicitWait"))));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(prop.getProperty("pageLoadTime"))));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
		
	}
	

}
