package stepDefinationss;

import com.mavenFramework.Utility.Utilityy;
import com.mavenFramework.Utility.base_class;//why I had to import here when I extended"ask Jahan bhaiya" he didnt had to import. but it was showing me error so I had to
import com.mavenFramework.action.homepageActions;
import com.mavenFramework.action.loginpageActions;
import com.mavenFramework.action.profilepageActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class logins extends base_class{
	
	homepageActions HomepageActions = new homepageActions();//created object for homepageActions class so we can call the the clickLoginLink method from that class inside the click_loginLink method/step
	loginpageActions LoginpageActions = new loginpageActions();
	profilepageActions ProfilepageActions = new profilepageActions();
	
	@Given("^Launch \"([^\"]*)\" for demo$")
	public void launch_for_demo(String URL) throws Throwable {
		getURL(URL);
		Utilityy.takescreenshot(driver, "Home Page");
	}

	@Then("^click loginLink$")
	public void click_loginLink() throws Throwable {
		HomepageActions.clickloginLink();//called the method here with the help of HomepageActionsObj from HomepageActions class
	}

	@Then("^Enter user name and password and click login button$")
	public void Enter_user_name_and_password_and_click_login_button() throws Throwable {
		LoginpageActions.UserCredential(prop.getProperty("USERNAME"),prop.getProperty("PASSWORD"));
	    Utilityy.takescreenshot(driver, "Login Page");
	}

	

	@Then("^verify user login successfully profile page$")
	public void verify_user_login_successfully_profile_page() throws Throwable {
		ProfilepageActions.verifyuserloginsuccessfullyprofilepage();
		Utilityy.takescreenshot(driver, "Profile Page");
	}

}
