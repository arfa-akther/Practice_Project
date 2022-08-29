package stepDefinationss;

import com.mavenFramework.Utility.base_class;
import com.mavenFramework.action.homepageActions;

import cucumber.api.java.en.Then;

public class cataogories extends base_class {
	homepageActions HomepageActions = new homepageActions();
	@Then("^click laptop link$")
	public void click_laptop_link() throws Throwable {
		HomepageActions.clicklaptoplink();
	}

	@Then("^verify laptops display$")
	public void verify_laptops_display() throws Throwable {
		HomepageActions.verifylaptopsdisplay();
	}
}
