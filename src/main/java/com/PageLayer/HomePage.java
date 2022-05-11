package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	@FindBy(xpath="//img[@alt='OrangeHRM']")
	WebElement logo;
		
	@FindBy(xpath = "//b[text()='Admin']")
	WebElement adminPage;
	
	@FindBy(xpath="\"//b[text()='PIM']")
	WebElement pimpage;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean  checkLogoFunctionality()
	{
		return logo.isDisplayed();
		
	}
	public void AdminPage()
	{
		adminPage.click();
	}
	public void PIMPage()
	{
		pimpage.click();
	}
}
