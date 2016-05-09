package tests;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationFramework.PageProvider;
import automationFramework.TestBase;
import pages.HomePage;
import pages.LoginPage;
import profiles.User;
import utils.TestUserTool;

public class TestAllProfiles extends TestBase {

	private List<User> myUsers = null;
	
	/**
	 * 
	 * @return Objects for the DataProvider
	 */
	@DataProvider(name="getLoginCredentials")
	 public Object[][] getLoginCredentials(){ 
		// Check if users are already taken from the database
		if (myUsers == null){
			myUsers = TestUserTool.getTestUsers();
		}

		Object[][] testdata = null; 
		
		// Create the nbr of object needed
		testdata = new Object[myUsers.size()][2];
		// Loop through all our users and put them in the objects
		int idx = 0;
		Iterator<User> iter = myUsers.iterator();
		while(iter.hasNext()){
			// We put the userId in the first object and the User object in the second object
			User usr = iter.next();
			testdata[idx][0] = usr.getUserid();
			testdata[idx][1] = usr;
			// Increase the idx
			idx = idx+1;
		}
		
		// Now we setup our tests
		setUp();
		// Now return the testdata with all our users from the database
		return testdata; 
	}

	/**
	 * Test Profile 1
	 * 
	 * @throws InterruptedException
	 */
	@Test(dataProvider = "getLoginCredentials")
	public void test(String userId, User myUser){
		// Go to the FD page and get all article Urls
		HomePage homePage = PageProvider.getDeveloperHomePage();
		homePage.OpenPage();
		homePage.clickSignIn();
		
		LoginPage loginPage = PageProvider.getLoginPage();
		loginPage.signIn(myUser);
		
		// Verify that the user is logged in
		assertTrue(myUser.getProfile().isLoggedIn(myUser,homePage));
		// Verify that the user has the correct links on the Top of the page
		assertTrue(myUser.getProfile().hasCorrectLinks(myUser,homePage));
		// Verify that the user has the correct menu items on the Top of the page
		assertTrue(myUser.getProfile().hasCorrectMenuItems(myUser,homePage));

		// Now we go to the Online Navigation page and test everything there
		homePage.clickMenuItemOnlineNavigation();
		// Verify that the user has the correct sidebarlinks on Online Navigation Page
		assertTrue(myUser.getProfile().hasCorrectSideBarItemsON(myUser,PageProvider.getOnlineNavigationPage()));

		// Now we go to the Navigation Software page and test everything there
		homePage.clickMenuItemNavigationSoftware();
		// Verify that the user has the correct sidebarlinks on Navigation Software Page
		assertTrue(myUser.getProfile().hasCorrectSideBarItemsNS(myUser,PageProvider.getNavigationSoftwarePage()));
		
		// Sign out for the next user
		homePage.clickSignOut();
	}
	
	@AfterTest
	public void quitDriver(){
		this.tearDown();
	}
	
}
