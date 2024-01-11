package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Genric.Generic_Methods;

public class AdminLogin extends Generic_Methods {
	
	
	public By username = By.id("username");
	public By Password = By.id("password");
	public By Submit = By.xpath("//input[@type='submit']");
	public By Error = By.xpath("//div[@class='alert alert-danger']");

	
	
	public void Login(WebDriver d , String Uname, String Pass) {
		SendKeys(d, username, Uname);
		SendKeys(d, Password, Pass);
		Click(d, Submit);
	}
	}

