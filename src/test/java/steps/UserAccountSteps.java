package test.java.steps;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Then;
import test.java.helpers.PageProvider;
import test.java.pageobjects.Page;

/**
 * This class contains all the steps needed for the User Account links 
 * In theory this is the Measury framework so this one is not that important 
 * - clicking on the links
 * - seeing the links
 * - etc.
 * @author Erwin
 */
public class UserAccountSteps {
	private Page myPage = null;
	
	public UserAccountSteps(){
		myPage = PageProvider.getDeveloperHomePage();
	}

	@Then("^I see the user sign_in link (.*)$")
	public void then_I_see_user_sign_in(String link)  throws Throwable {
		assertTrue(myPage.hasSignInLink() == Boolean.parseBoolean(link));
	}

	@Then("^I see the user register link (.*)$")
	public void then_I_see_user_register(String link)  throws Throwable {
		assertTrue(myPage.hasRegisterLink() == Boolean.parseBoolean(link));
	}

	@Then("^I see the user my_account link (.*)$")
	public void then_I_see_user_my_account_link(String link)  throws Throwable {
		assertTrue(myPage.hasAccountLink() == Boolean.parseBoolean(link));
	}

	@Then("^I see the user sign_out link (.*)$")
	public void then_I_see_user_sign_out(String link)  throws Throwable {
		// Verify that this link is showing on the page. Since it is part of the header we can use any page
		assertTrue(myPage.hasSignOutLink() == Boolean.parseBoolean(link));
	}
}
