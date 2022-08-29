package com.mavenFramework.action;



import org.testng.Assert;

import com.mavenFramework.Utility.base_class;
import com.mavenFramework.locator.profilepageLocator;

public class profilepageActions extends base_class {
	
	profilepageLocator ProfilepageLocator = new profilepageLocator ();
	public void verifyuserloginsuccessfullyprofilepage () throws Exception {
		
		boolean profilepage = ProfilepageLocator.profilePage.isDisplayed();
	    Assert.assertTrue(profilepage);
	     Thread.sleep(5000);
	}
}

