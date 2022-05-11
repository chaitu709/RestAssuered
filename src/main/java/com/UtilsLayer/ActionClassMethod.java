package com.UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseLayer.BaseClass;

public class ActionClassMethod extends BaseClass{
	//click, double click, right click, dragAndDrog, moveToElement,clickAndHold,
		// KeyDown, KeyUP,
	public static void ClickOnElement(WebElement wb)
	{
		new Actions(driver).click().build().perform();
	}
	public static void DoubleClickOnElement(WebElement wb)
	{
		new Actions(driver).doubleClick().build().perform();
	}
	public static void RightClickOnElement(WebElement wb)
	{
		new Actions(driver).contextClick().build().perform();
	}
	public static void DragandDrop(WebElement wb,WebElement wb1)
	{
		new Actions(driver).dragAndDrop(wb, wb1).build().perform();
	}
	public static void MoveToElement(WebElement wb)
	{
		new Actions(driver).moveToElement(wb).build().perform();
	}
	public static void ClickonElement(WebElement wb)
	{
		new Actions(driver).moveToElement(wb).build().perform();
	}
	public static void ClickOnHold(WebElement wb)
	{
		new Actions(driver).clickAndHold().build().perform();
	}
	public static void Release()
	{
		new Actions(driver).release().build().perform();
	}
	public static void EnterData(WebElement wb,String value)
	{
		new Actions(driver).keyDown(Keys.SHIFT).sendKeys(value).build().perform();
	}
	public static void MoveEndofPage()
	{
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	}
	public static void MoveToHomePage()
	{
		new Actions(driver).keyUp(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	}
	
}
