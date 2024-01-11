package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static WebDriver d;
	
	/**
	 * This method will launch the application based on info passed in Config.properties file.
	 * @return WebDriver
	 * @throws IOException : this will throw exception if file is not loaded or found.
	 */
	public WebDriver lauch() throws IOException {
		Properties obj = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\config.properties");
		obj.load(fis);
		String BrowserName = obj.getProperty("browser"); //step for proprties folder data to receive
		String URL = obj.getProperty("url");
		if(BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			d =new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			d= new EdgeDriver();
		}
		d.get(URL);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return d;
	}

/**
 * This method will close the current browser opened in current session.
 */
	public void closecurrentbrowser() {
		d.close();
	}
	
	/**
	 * This method will close all the browsers opened in current session.
	 */
	public void closeallbrowsers() {
		d.quit();
	}
}
