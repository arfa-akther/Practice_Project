package com.mavenFramework.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mavenFramework.Utility.base_class;

public class profilepageLocator extends base_class{
	public profilepageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(how=How.ID, using= "nameofuser")
	public WebElement profilePage;
	
	//@FindBy(how=How.LINK_TEXT, using= "Welcome arfadepa")
	//public WebElement verify;
}	
