package test.java.steps;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import test.java.helpers.TestFileReader;
import test.java.modules.profiles.Profile1;
import test.java.modules.profiles.Profile2;
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
	public void given_I_am_logged_in_as_a_user_with_role(int role) throws Throwable {
		// Get the correct user for this test
		getMyUser(role);

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
		getMyUser();
		assertTrue(myUser.getProfile().hasCorrectMenuLinks(myUser, PageProvider.getDeveloperHomePage()));
		// Logout again for the next test
		PageProvider.getDeveloperHomePage().clickSignOut();
	}

	@Then("^I see the correct menu items$")
	public void then_I_can_see_the_correct_menu_items() throws Throwable {
		getMyUser();
		assertTrue(myUser.getProfile().hasCorrectMenuItems(myUser, PageProvider.getDeveloperHomePage()));
		// Logout again for the next test
		PageProvider.getDeveloperHomePage().clickSignOut();
	}

	/**
	 * Method to get a user. If it is not available it will get it from file
	 * 
	 * @return
	 */
	private void getMyUser(int role) throws Exception {
		// If we don't have a user yet we will get one from our file
		if (myUser == null) {
			// Let's find a user with this role for our test
			List<User> users = TestFileReader.getTestUsers();
			Iterator<User> iter = users.iterator();
			while (iter.hasNext()) {
				User u = iter.next();
				if(role==1){
					if (u.getProfile().getClass().equals(Profile1.class)) {
						myUser = u;
						break;
					}
				}
				if(role==2){
					if (u.getProfile().getClass().equals(Profile2.class)) {
						myUser = u;
						break;
					}
				}
			}
		}
	}

	/**
	 * This should only be used when the user is already known or when it doesn't matter which user you get
	 */
	private void getMyUser(){
		if(myUser == null){
			// Then lets just get the first user from the file
			List<User> users = TestFileReader.getTestUsers();
			Iterator<User> iter = users.iterator();
			while (iter.hasNext()) {
				User u = iter.next();
					myUser = u;
					break;
			}
		}
	}
}
