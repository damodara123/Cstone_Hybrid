package pages;

import org.openqa.selenium.By;

public class Home extends AdminLogin {

	public By dashboard = By.xpath("//h1[text()='Dashboard']");
	
	public By Dept = By.xpath("//select[@name='dept']");
	
	public By CreateFacultyLink = By.xpath("//a[@href='/capstoneadmin/create_faculty/']");
	
	public By ProjectMgmtLink = By.partialLinkText("Project Management");
}
