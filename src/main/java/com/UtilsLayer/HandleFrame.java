package com.UtilsLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class HandleFrame extends BaseClass{

	public static WebDriver MovetoChildframeusingName(String nameid)
	{
		return driver.switchTo().frame(nameid);
	}
	public static WebDriver MovetoChildframeusingIndex(int Index)
	{
		return driver.switchTo().frame(Index);
	}
	public static WebDriver MovetoChildframeusingWebElement(WebElement wb)
	{
		return driver.switchTo().frame(wb);
	}
	public static WebDriver SwitchToParentFrame()
	{
		return driver.switchTo().parentFrame();
	}
	public static WebDriver SwitchTopFrame()
	{
		return driver.switchTo().defaultContent();
	}
}
