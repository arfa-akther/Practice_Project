package com.mavenFramework.action;

import com.mavenFramework.Utility.base_class;
import com.mavenFramework.locator.loginpageLocator;

public class loginpageActions extends base_class {
 
	public void UserCredential(String u,String p) throws Exception {
		loginpageLocator LoginpageLocator = new loginpageLocator();
		
		LoginpageLocator.UserName.sendKeys(u);
		LoginpageLocator.UserPass.sendKeys(p);
		Thread.sleep(1000);
		LoginpageLocator.LoginButton.click();
		
	} 
}
