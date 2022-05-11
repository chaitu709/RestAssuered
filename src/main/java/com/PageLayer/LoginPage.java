package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	

	public LoginPage() {
	
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="txtUsername")
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	@FindBy(id="forgotPasswordLink")
	WebElement forgotpass;

	
	public void LoginFunctionality(String uname,String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		
		if(uname == "Admin" && pass=="admin123")
		{
			btnLogin.click();
		}
		else if( !(uname == "Admin")|| ( pass=="admin123"))
		{
			btnLogin.click();
			
			forgotpass.click();
		}
	}
   
}
