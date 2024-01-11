package Genric;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Browser;

public class Generic_Methods extends Excel_Reading {

	public boolean Click(WebDriver driver, By elementToBeClicked)
	{
		WebElement ele=driver.findElement(elementToBeClicked);
		if(ele.isDisplayed() & ele.isEnabled())
		{
			try
			{
				ele.click();
				//delay(driver, elementToBeClicked,10);
				//Screen_Shot(driver);
				return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;	
			}
			
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean SendKeys(WebDriver d, By elementToBeEntered, String text)
	{
		
		if(Enabled(d,elementToBeEntered) && display(d,elementToBeEntered))
		{
			try
			{
				d.findElement(elementToBeEntered).sendKeys(text);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		else
		{
			return false;
		}
		
	
	}

	public boolean Enabled(WebDriver d, By elementToBeEnable)
	{
		try
		{
			d.findElement(elementToBeEnable).isEnabled();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	//Generic isEnabled method
	public boolean display(WebDriver d, By elementToBevisible)
	{
		try
		{
			d.findElement(elementToBevisible).isDisplayed();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void delay(WebDriver dr, By element,long time)
	{	
		WebElement firstResult = new WebDriverWait(dr, Duration.ofSeconds(time))
		        .until(ExpectedConditions.elementToBeClickable((element)));	
		
	}


public boolean Select_by_Text(WebDriver d, By dropdon,String text)
	{
		if(Enabled(d,dropdon) & display(d,dropdon))
		{
			try 
			{
			Select drpCountry = new Select(d.findElement(dropdon));
			drpCountry.selectByVisibleText(text);
			return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	//Generic method for Select_By_Index functionality
	public boolean Select_by_Index(WebDriver d, By dropdon,int index)
	{
		if(Enabled(d,dropdon) & display(d,dropdon))
		{
			try 
			{
			Select drpCountry = new Select(d.findElement(dropdon));
			drpCountry.selectByIndex(index);
			return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	//generic method for drop_down_click function
	public boolean Dropdown_Click(WebDriver d, By dropdon)
	{
		if(Enabled(d,dropdon) & display(d,dropdon))
		{
			try 
			{
			  Click(d, dropdon);
			return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	
	//generic for check box
	public boolean Checkbox(WebDriver d, By check)
	{
		if(Enabled(d,check) & display(d,check))
		{
			try 
			{
			  Click(d, check);
			return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	

	//generic for radio button
	public boolean Radiobutton(WebDriver d, By radiobtn)
			{
				if(Enabled(d,radiobtn) & display(d,radiobtn))
				{
					try 
					{
					  Click(d, radiobtn);
					return true;
					}
					catch(Exception e)
					{
						return false;
					}
				}
				else
				{
					return false;
				}
			}
	
	//generic for clear text data
	public boolean Clear(WebDriver d, By clearpath)
			{
				if(Enabled(d,clearpath) & display(d,clearpath))
				{
					try 
					{
					  d.findElement(clearpath).clear();
					return true;
					}
					catch(Exception e)
					{
						return false;
					}
				}
				else
				{
					return false;
				}
			}
	
	//generic method for  scroll down
	public void Scroll_dwn(WebDriver d, int num)
	{
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,"+num+")", "");
	}
	

	
}
