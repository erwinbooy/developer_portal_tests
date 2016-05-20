package test.java.steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import test.java.helpers.PageProvider;
import test.java.helpers.TestUsers;
import test.java.modules.users.Roles;
import test.java.modules.users.User;
import test.java.pageobjects.HomePage;
import test.java.pageobjects.LoginPage;
import test.java.pageobjects.Page;

/**
 * This class can be called with different roles 
 * The roles should be defined in the profiles package
 * Each profile knows what it should see and what not
 * @author Erwin
 *
 */
public class LoginSteps{
	private User myUser = null;

	@Given("^I am logged in as a user with the role (.*)$")
	public void given_I_am_logged_in_as_a_user_with_role_nbr(String role) throws Throwable {
		// Get the correct user for this test
		myUser = TestUsers.getUserWithRole(Roles.valueOf(role));

		// Let's log in. First open the Page
		HomePage homePage = PageProvider.getDeveloperHomePage();
		homePage.OpenPage();
		homePage.clickSignIn();
		// Then fill in the login details
		LoginPage loginPage = PageProvider.getLoginPage();
		loginPage.signIn(myUser);
		// Verify that we are also really logged in
		assertTrue(homePage.isLoggedIn(myUser));
	}

	@Given("^I am not logged in$")
	public void given_I_am_not_logged_in() throws Throwable {
		// Lets just open the homepage 
		HomePage homePage = PageProvider.getDeveloperHomePage();
		// make sure we are not logged in
		homePage.clickSignOut();
		homePage.OpenPage();
	}
	
	@And("^I log out$")
	public void I_log_out() throws Throwable{
		// Lets logout
		Page homepage = PageProvider.getDeveloperHomePage();
		homepage.clickSignOut();
	}
}
