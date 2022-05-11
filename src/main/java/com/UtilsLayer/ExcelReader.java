package com.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.BaseLayer.BaseClass;

public class ExcelReader extends BaseClass{
	public static XSSFWorkbook workbook;
	public ExcelReader(String path )
	{
		File f=new File(path);
		try {
			FileInputStream fis=new FileInputStream(f);
			workbook =new XSSFWorkbook(fis);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static String getDataFromExcel(int sheet,int row,int cell)
	{
		return workbook.getSheetAt(sheet).getRow(row).getCell(cell).getStringCellValue();
	}
	public static int countRow(int sheet)
	{
		return workbook.getSheetAt(sheet).getLastRowNum();
	}
	public static int countCell(int sheet)
	{
		return workbook.getSheetAt(sheet).getRow(0).getLastCellNum();
	}
}
