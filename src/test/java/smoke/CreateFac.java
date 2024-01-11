package smoke;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Create_Faculty;

public class CreateFac extends Create_Faculty {
	
	
@BeforeClass
	public void loadapp() throws IOException {
		d= lauch();
		Login(d, "Capstone", "123456");
		//this is for github demo
		
	}
@BeforeMethod
public void clicklink() {
	
	Click(d, CreateFacultyLink);
	//Click(d, CreateFacultyLink);
}
@Test(priority = 1, description = "Fill the faculty form with valid details and Click Reset btn")
public void Resetvaliddetails() {
	
	Fillform("Test", System.getProperty("user.dir")+"\\src\\test\\resources\\download.jpg", "9988776655", "test@rsoft.com", "125", "tester", "Automation", false);
	Click(d, FcCloseX);
	List<WebElement> dd = d.findElements(Error);
}
@Test(priority = 2,description  = "Fill the faculty form with valid details and Click Submit btn")
public void Submitvaliddetails() {
	Fillform("Test", System.getProperty("user.dir")+"\\src\\test\\resources\\download.jpg", "9988776655", "test@rsoft.com", "125", "tester", "Automation", true);
	
}
@AfterClass
public void close() {
	closeallbrowsers();
}

	
}
