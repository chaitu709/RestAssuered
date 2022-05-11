package TestLayer;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;

import com.PageLayer.LoginPage;

public class HomePageTest extends BaseClass{
	
	@BeforeClass
	public void Stup()
	{
		BaseClass.Intialization();
	}
	@Test(priority =1)
	public void ValigateHomePageTest()
	{
		LoginPage login=new LoginPage();
		login.LoginFunctionality(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	public void validateurl()
	{
		Assert.assertEquals(driver.getPageSource().contains(""), false);
	}

}
