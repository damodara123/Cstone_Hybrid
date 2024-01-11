package smoke;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Genric.Excel_Reading;
import pages.Home;

public class User_validations extends Home {
	

	
	@BeforeClass
	public void loadApp() throws IOException {
		d = lauch();
	}

	
	@Test
	public void testing() throws IOException {
		XSSFSheet sh = fileloading(System.getProperty("user.dir")+"\\src\\test\\resources\\Login.xlsx", "Sheet1");
		int row = sh.getLastRowNum();
		for(int i =1; i<=row; i++) {
		Row r = sh.getRow(i);
		String uname = r.getCell(0).toString();
		String pass = r.getCell(1).toString();
			Login(d, uname, pass);
		
		}
	}
}
