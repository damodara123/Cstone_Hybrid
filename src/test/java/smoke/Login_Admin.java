package smoke;

import java.io.IOException;

import org.apache.commons.exec.DaemonExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Home;

public class Login_Admin extends Home {

	
	
	
	@BeforeClass
	public void loadapp() throws IOException {
		d = lauch();
	}
	@Test
	public void login_Validation() {
		Login(d, "Capstone", "123456");
		//Assert.assertEquals(display(d, dashboard), true);
		//Assert.assertEquals(display(d, dashboard), true);
	}
	@AfterClass
	public void exit() {
		closeallbrowsers();
	}
}
