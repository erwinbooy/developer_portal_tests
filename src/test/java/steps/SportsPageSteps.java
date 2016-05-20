package test.java.steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Then;
import sun.security.util.PendingException;
import test.java.helpers.PageProvider;
import test.java.pageobjects.SportsPage;

public class SportsPageSteps {
	
	private SportsPage myPage = null;
	
	public SportsPageSteps(){
		myPage = PageProvider.getSportsPage();
	}
	
	@Then("^I see the sports link overview (.*)$")
	public void i_see_the_sports_link_overview(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemOverview() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the sports link camera_media_server (.*)$")
	public void i_see_the_sports_link_camera_media_server(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemCameraMediaServer() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the sports link mysports_cloud (.*)$")
	public void i_see_the_sports_link_mysports_cloud(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemMySportsCloud() == Boolean.parseBoolean(visible));
	}
}
