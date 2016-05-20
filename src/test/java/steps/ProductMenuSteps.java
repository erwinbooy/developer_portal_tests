package test.java.steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.java.helpers.PageProvider;
import test.java.pageobjects.Page;

/**
 * This class contains all the steps needed for the User Account links
 * Since these links are available everywhere we just use the HomePage 
 * - clicking on the links
 * - seeing the links
 * - etc.
 * @author Erwin
 *
 */
public class ProductMenuSteps {
	
	public ProductMenuSteps(){
		myPage = PageProvider.getDeveloperHomePage();
	}
	
	private Page myPage = null;

	@When("^I click on the product menu sports$")
	public void i_click_on_the_product_menu_sports() throws Throwable {
		myPage.clickMenuItemSports();
	}
	
	@Then("^I see the product menu home (.*)$")
	public void i_see_the_product_menu_home(String link) throws Throwable {
		assertTrue(myPage.hasMenuItemHome() == Boolean.parseBoolean(link));
	}

	@Then("^I see the product menu online_navigation (.*)$")
	public void i_see_the_product_menu_online_navigation(String link) throws Throwable {
		assertTrue(myPage.hasMenuItemOnlineNavigation() == Boolean.parseBoolean(link));
	}

	@Then("^I see the product menu navigation_software (.*)$")
	public void i_see_the_product_menu_navigation_software(String link) throws Throwable {
		assertTrue(myPage.hasMenuItemNavigationSoftware() == Boolean.parseBoolean(link));
	}

	@Then("^I see the product menu realtime_maps (.*)$")
	public void i_see_the_product_menu_realtime_maps(String link) throws Throwable {
		assertTrue(myPage.hasMenuItemRealTimeMaps() == Boolean.parseBoolean(link));
	}

	@Then("^I see the product menu bridge (.*)$")
	public void i_see_the_product_menu_bridge(String link) throws Throwable {
		assertTrue(myPage.hasMenuItemBridge() == Boolean.parseBoolean(link));
	}

	@Then("^I see the product menu sports (.*)$")
	public void i_see_the_product_menu_sports(String link) throws Throwable {
		assertTrue(myPage.hasMenuItemSports() == Boolean.parseBoolean(link));
	}
}
