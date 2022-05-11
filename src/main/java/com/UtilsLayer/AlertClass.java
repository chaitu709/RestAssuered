package com.UtilsLayer;

import org.openqa.selenium.Alert;

import com.BaseLayer.BaseClass;

public class AlertClass extends BaseClass {
	
	public static Alert alt;
	public static void SwitchtoAlert()
	{
		alt=driver.switchTo().alert();
	}
	public static void Okbutton()
	{
		alt.accept();
	}
	public static void Cancelbutton()
	{
		alt.dismiss();
	}
	public static String CaptureText()
	{
		
		return alt.getText();
	}
	public static void EnterData(String value)
	{
		alt.sendKeys(value);
	}
}
