package com.mavenFramework.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class {
    public static Properties prop;
    public static WebDriver driver; 
	public base_class() { //contstructor
		prop = new Properties();//created object for properties
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\mavenFramework\\configure\\configuer.properties");
			 prop.load(fls);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//BROWSER SETUP
	
	public void initializeBrowser() {
		String Browserset= prop.getProperty("Browser1");//since our browser1 is chrome which is mentioned in the config.properties file
		if(Browserset.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\WebDriver\\chromedriver.exe");//copy the browser location here from the webdriver folder by right click and properties
		    driver = new ChromeDriver();//declared global variable for this web  driver
			driver.get("https://www.demoblaze.com/");
			driver.manage().timeouts().pageLoadTimeout(testdata.pageLoadTimeout, TimeUnit.SECONDS); // Maximum time for loading page, we are calling it from testdata class here where it is stored
			driver.manage().timeouts().implicitlyWait(testdata.implicitlyWait, TimeUnit.SECONDS);//for loading html/web elements,we are calling it from testdata class here where it is stored
			//driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			System.out.println("Chrome Browser launch");//this is optional
			
		}
		else if (Browserset.equals("FF"));
			
		
		
		
	}
	public static void getURL(String URL) {// TO Make the application dynamic
		 driver.get(prop.getProperty("URL"));
	}
}
