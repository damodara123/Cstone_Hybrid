package pages;

import org.openqa.selenium.By;

public class Create_Faculty extends Home {
	
	public By CreateFacultyBtn = By.xpath("//button[@class='btn btn-primary mr-4']");
	
	public By FcNameInput = By.id("FacultyTitle");
	
	public By FcProfileBrowse = By.id("customFile");
	
	public By FcContactInput = By.id("FacultyContact");
	
	public By FcEmailInput = By.id("FacultyEmail");
	
	public By FcdeptSelect = By.xpath("//select[@class='custom-select deptId']");
	
	public By FcDesSelect = By.xpath("//select[@class='custom-select design']");
	
	public By FcSkilltext = By.xpath("//textarea[@name='skills']");
	public By FcSubmitBtn = By.xpath("//input[@type='submit']");
	public By FCResetBtn = By.xpath("//input[@type='reset']");
	public By FcCloseX = By.xpath("//button[@class='close text-white']");
	
	
	public void Fillform(String FCName, String Path, String Contact,String Email, String Dept,String Des,String Skill, boolean fill) {
		Click(d, CreateFacultyBtn);
		SendKeys(d, FcNameInput, FCName);
		SendKeys(d, FcProfileBrowse, Path);
		SendKeys(d, FcContactInput, Contact);
		SendKeys(d, FcEmailInput, Email);
		Select_by_Text(d, FcdeptSelect, Dept);
		Select_by_Text(d, FcDesSelect, Des);
		SendKeys(d, FcSkilltext, Skill);
		if(fill==true) {
		Click(d, FcSubmitBtn);
		}
		else {
			Click(d, FCResetBtn);
		}
		
	}

}
