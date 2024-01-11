package smoke;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Home;

public class Dp_User_Vaidation extends Home {
		

		
		@BeforeClass
		public void loadApp() throws IOException {
			d = lauch();
		}

		
		@DataProvider(name="User-credentials")
		public Object[][] dpmethod(){
			return new Object[][] {{"cap","1234"},{"captone","123"},{"capstone","123456"} };
		}
		@Test(dataProvider = "User-credentials")
		public void testing(String uname,String pass)  {
				Login(d, uname, pass);
			
			}
		@AfterClass	
		public void close() {
			closeallbrowsers();
		}
}
