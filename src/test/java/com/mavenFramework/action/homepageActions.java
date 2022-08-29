package com.mavenFramework.action;

import org.testng.Assert;

import com.mavenFramework.Utility.base_class;
import com.mavenFramework.locator.homepageLocator;



public class homepageActions extends base_class{
	homepageLocator HomepageLocator = new homepageLocator();
	
	public void clickloginLink () throws Exception {//kept same as login.feature file steps name
		Thread.sleep(3000);
		HomepageLocator.loginLink.click();//called the loginlink locator from homepagelocator
		
		
	}
	
	public void clicklaptoplink () throws Exception {
		HomepageLocator.LaptopLink.click();
		Thread.sleep(3000);
	}
	
	public void verifylaptopsdisplay () {
		boolean laptopss= HomepageLocator.LaptopItem.isDisplayed();
		Assert.assertTrue(laptopss);
	}
}
 