package com.mavenFramework.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mavenFramework.Utility.base_class;

public class homepageLocator extends base_class{
 
	public homepageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using= "login2")
	public WebElement loginLink;
	
	@FindBy(how=How.XPATH, using= "//a[text()='Laptops']")
	public WebElement LaptopLink;
	
	@FindBy(how=How.XPATH, using= "//a[text()='Sony vaio i5']")
	public WebElement LaptopItem;
	
	
}
