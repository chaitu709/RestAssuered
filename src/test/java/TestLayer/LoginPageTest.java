package TestLayer;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	@BeforeClass
	public void Setup()
	{
		BaseClass.Intialization();
	}
	
	@Test
	public void ValidateLoginFunctionality()
	{
		LoginPage login=new LoginPage();
		
		login.LoginFunctionality(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
