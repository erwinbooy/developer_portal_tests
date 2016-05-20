package test.java.steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import test.java.helpers.TestUsers;
import test.java.modules.profiles.User;
import test.java.pageobjects.HomePage;
import test.java.pageobjects.LoginPage;
import test.java.pageobjects.PageProvider;

/**
 * This class can be called with different roles 
 * The roles should be defined in the profiles package
 * Each profile knows what it should see and what not
 * @author Erwin
 *
 */
public class ProfileTest{
	private User myUser = null;

	@Given("^I am logged in as a user with the role (\\d+)$")
	public void given_I_am_logged_in_as_a_user_with_role_nbr(int role) throws Throwable {
		// Get the correct user for this test
		myUser = TestUsers.getUserWithRoleNbr(role);

		// Let's log in. First open the Page
		HomePage homePage = PageProvider.getDeveloperHomePage();
		homePage.OpenPage();
		homePage.clickSignIn();
		// Then fill in the login details
		LoginPage loginPage = PageProvider.getLoginPage();
		loginPage.signIn(myUser);
		// Verify that we are also really logged in
		assertTrue(myUser.getProfile().isLoggedIn(myUser, homePage));
	}

	@Then("^I see the correct menu links$")
	public void then_I_can_see_the_correct_menu_links() throws Throwable {
		myUser = TestUsers.getUserWithRole(myUser.getProfile());
		assertTrue(myUser.getProfile().hasCorrectMenuLinks(myUser, PageProvider.getDeveloperHomePage()));
		// Logout again for the next test
		PageProvider.getDeveloperHomePage().clickSignOut();
	}

	@Then("^I see the correct menu items$")
	public void then_I_can_see_the_correct_menu_items() throws Throwable {
		myUser = TestUsers.getUserWithRole(myUser.getProfile());
		assertTrue(myUser.getProfile().hasCorrectMenuItems(myUser, PageProvider.getDeveloperHomePage()));
		// Logout again for the next test
		PageProvider.getDeveloperHomePage().clickSignOut();
	}
	
	@Then("^I see menu link (.*)$")
	public void then_I_see_menu_link(String link)  throws Throwable {
		// Verify that this link is showing on the page. Since it is part of the header we can use any page
		PageProvider.getDeveloperHomePage().hasLinkWithText(link);
	}
}
