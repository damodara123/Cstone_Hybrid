package Genric;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.Browser;


public class Excel_Reading extends Browser {

	
	public XSSFSheet fileloading(String path, String sheetname) throws IOException
	{
		
			FileInputStream fs = new FileInputStream(path);//file loading
			XSSFWorkbook wb = new XSSFWorkbook(fs);//work book loading.
			
			XSSFSheet sheet = wb.getSheet(sheetname);//get the sheet
			return sheet;
			
		
	}
}
