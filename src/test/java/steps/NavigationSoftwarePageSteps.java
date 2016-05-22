package test.java.steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.java.helpers.PageProvider;
import test.java.pageobjects.NavigationSoftwarePage;
import test.java.pageobjects.SportsPage;

public class NavigationSoftwarePageSteps {

	private NavigationSoftwarePage myPage = null;

	public NavigationSoftwarePageSteps() {
		myPage = PageProvider.getNavigationSoftwarePage();
	}

	@When("^I click on the navigation software item in the products menu$")
	public void i_click_on_the_navigation_software_item_in_the_products_menu() throws Throwable {
		myPage.clickMenuItemNavigationSoftware();
	}

	@Then("^I see the documentation under the navkit sidebar item (.*)$")
	public void i_see_the_documentation_under_the_navkit_sidebar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemDocumentation() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the downloads under the navkit sidebar item (.*)$")
	public void i_see_the_downloads_under_the_navkit_sidebar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemDownloads() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the faq under the navkit sidebar item (.*)$")
	public void i_see_the_faq_under_the_navkit_sidebar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemFAQ() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the integration kit under the navkit sidebar item (.*)$")
	public void i_see_the_integration_kit_under_the_navkit_sidebar_item(String visible) throws Throwable {
		assertTrue(myPage.hasSideBarItemInegrationKit() == Boolean.parseBoolean(visible));
	}
}
