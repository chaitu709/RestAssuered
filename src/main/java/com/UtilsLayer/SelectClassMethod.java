package com.UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;

public class SelectClassMethod  extends BaseClass{

	public static void SelectbyIndex(WebElement wb,int index)
	{
		new Select(wb).selectByIndex(index);
	}
	public static void SelectbyValue(WebElement wb,String value)
	{
		new Select(wb).selectByValue(value);
	}
	public static void selectbyindex(WebElement wb,String value)
	{
		new Select(wb).selectByVisibleText(value);
	}
	public static String DropdownSelectedvalue(WebElement wb)
	{
		return new Select(wb).getFirstSelectedOption().getText();
	}
	public static void PrintAllValue(WebElement wb)
	{
		List<WebElement> ls=new Select(wb).getOptions();
		for (WebElement abc : ls) {
			System.out.println(abc.getText());
		}
	}
	public static int countDPList(WebElement wb)
	{
		return new Select(wb).getOptions().size();
	}
	public static void specificValuePresent(WebElement wb, String value)
	{
		List<WebElement> ls = new Select(wb).getOptions();

		for (WebElement abc : ls) 
		{
			if (abc.getText().contains(value)) 
			 {
				System.out.println("Value is Present " + abc.getText());
			}
	    }
	}
}
