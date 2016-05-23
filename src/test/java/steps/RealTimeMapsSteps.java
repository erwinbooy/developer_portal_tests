package test.java.steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.java.helpers.PageProvider;
import test.java.pageobjects.RealTimeMapsPage;

public class RealTimeMapsSteps {

	private RealTimeMapsPage myPage = null;

	public RealTimeMapsSteps() {
		myPage = PageProvider.getRealTimeMapsPage();
	}

	@When("^I click on map input tracker sidebar item on the real time maps page$")
	public void i_click_on_map_input_tracker_sidebar_item_on_the_real_time_maps_page() throws Throwable {
		myPage.clickSideBarItemMapInputTracker();
	}

	@When("^I click on nds map updates sidebar item on the real time maps page$")
	public void i_click_on_nds_map_updates_sidebar_item_on_the_real_time_maps_page() throws Throwable {
		myPage.clickSideBarItemNdsMapUpdates();
	}

	@Then("^I see the documentation under the nds map updates sidebar item (.*)$")
	public void i_see_the_documentation_under_the_nds_map_updates_sidebar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemDocumentation() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the download under the nds map updates sidebar item (.*)$")
	public void i_see_the_docwnload_under_the_nds_map_updates_sidebar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemDownload() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the request acccess under the nds map updates sidbar item (.*)$")
	public void i_see_the_request_acccess_under_the_nds_map_updates_sidbar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemRequestAccess() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the documentation under the map input tracker sidebar item (.*)$")
	public void i_see_the_documentation_under_the_map_input_tracker_sidebar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemDocumentation() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the faq under the map input tracker sidbar item (.*)$")
	public void i_see_the_faq_under_the_map_input_tracker_sidbar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemFAQ() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the request acccess under the map input tracker sidbar item (.*)$")
	public void i_see_the_request_acccess_under_the_map_input_tracker_sidbar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemRequestAccess() == Boolean.parseBoolean(visible));
	}
}
