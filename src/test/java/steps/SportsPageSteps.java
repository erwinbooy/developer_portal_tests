package test.java.steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.java.helpers.PageProvider;
import test.java.pageobjects.SportsPage;

/**
 * This class contains all the steps needed for the Sports Page Since steps are
 * only available on that page - clicking on the links - seeing the links - etc.
 * 
 * @author Erwin
 *
 */
public class SportsPageSteps {

	private SportsPage myPage = null;

	public SportsPageSteps() {
		myPage = PageProvider.getSportsPage();
	}

	@When("^I click on the MySports cloud sidebar item$")
	public void i_click_on_the_MySports_cloud_sidebar_item() throws Throwable {
		myPage.clickSideBarItemMySportsCloud();
	}

	@When("^I click on the camera media server sidebar item$")
	public void i_click_on_the_camera_media_server_sidebar_item() throws Throwable {
		myPage.clickSideBarItemCameraMediaServer();
	}

	@Then("^I see the overview link on the sports page (.*)$")
	public void i_see_the_sports_link_overview(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemOverview() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the camera_media_server item on the sports page (.*)$")
	public void i_see_the_sports_link_camera_media_server(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemCameraMediaServer() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the my_sports item on the sports page (.*)$")
	public void i_see_the_sports_link_mysports_cloud(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemMySportsCloud() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the authorization under the mysports cloud sidebar item (.*)$")
	public void i_see_the_authorization_under_the_mysports_cloud_sidebar(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarSubItemAuthorization() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the documentation under the mysports cloud sidebar item (.*)$")
	public void i_see_the_documentation_under_the_mysports_cloud_sidebar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarSubItemMySportsDocumentation() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the faq under the mysports cloud sidbar item (.*)$")
	public void i_see_the_faq_under_the_mysports_cloud_sidbar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarSubItemFAQ() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the forum under the mysports cloud sidbar item (.*)$")
	public void i_see_the_forum_under_the_mysports_cloud_sidbar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarSubItemForum() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the terms of use under the mysports cloud sidbar item (.*)$")
	public void i_see_the_terms_of_use_under_the_mysports_cloud_sidbar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarSubItemTermsOfUse() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the api guidelines under the camera media server sidebar item (.*)$")
	public void i_see_the_api_guidelines_under_the_camera_media_server_sidebar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarSubItemApiGuidelines() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the documentation under the camera media server sidebar item (.*)$")
	public void i_see_the_documentation_under_the_camera_media_server_sidebar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarSubItemDocumentation() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the sensor data format under the camera media server sidebar item (.*)$")
	public void i_see_the_sensor_data_format_under_the_camera_media_server_sidebar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarSubItemSensorDataFormat() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the tags highlights format under the camera media server sidebar item (.*)$")
	public void i_see_the_tags_highlights_format_under_the_camera_media_server_sidebar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarSubItemTagsHighlightsFormat() == Boolean.parseBoolean(visible));
	}
}
