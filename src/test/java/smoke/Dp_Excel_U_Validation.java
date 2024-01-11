package smoke;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Home;

public class Dp_Excel_U_Validation extends Home {
	

	
	@BeforeClass
	public void loadApp() throws IOException {
		d = lauch();
	}

	public Object[][] exceldata() throws IOException{
		XSSFSheet sh = fileloading(System.getProperty("user.dir")+"\\src\\test\\resources\\Login.xlsx", "Sheet1");
		 
		 int Array_r ,Array_c;
		 int trows = sh.getLastRowNum();
		 int tcolm = 3;
		 String[][] darray= new String[trows][tcolm];
		 Array_r=0;
		 for(int exi =1;exi<=trows;exi++,Array_r++) {
			Array_c =0;
			 for(int exj = 0;exj<tcolm;exj++,Array_c++) {
				 Row row = sh.getRow(exi);
				 String celldata = row.getCell(exj).toString();
				 darray[Array_r][Array_c] = celldata;
			 }
		 }
		return darray;
	}
	
	@DataProvider(name="excel-validation")
	public Object[][] dp() throws IOException{
		Object[][] t = exceldata();
		return t;
	}
	@Test(dataProvider = "excel-validation")
	public void testing(String uname,String pass,String ass)  {
			Login(d, uname, pass);
			if(ass.equalsIgnoreCase("True")) {
				delay(d, dashboard, 10);
				Assert.assertEquals(display(d, dashboard), true);
			}
			else {
				//delay(d, dashboard, 10);
				Assert.assertEquals(display(d, Error), true);
			}
		
		}
	@AfterClass
public void close() {
	closeallbrowsers();
}
}


