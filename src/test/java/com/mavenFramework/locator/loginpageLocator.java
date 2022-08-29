package com.mavenFramework.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mavenFramework.Utility.base_class;

public class loginpageLocator extends base_class {

	public loginpageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using= "loginusername")
	public WebElement UserName;
	
	@FindBy(how=How.ID, using= "loginpassword")
	public WebElement UserPass;
	
	@FindBy(how=How.XPATH, using= "//button[text()='Log in']")
	public WebElement LoginButton;
	

}
