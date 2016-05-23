package test.java.steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.java.helpers.PageProvider;
import test.java.pageobjects.Page;

/**
 * This class contains all the steps needed for the Products Menu 
 * Since these links are available everywhere we just use the HomePage 
 * - clicking on the links
 * - seeing the links
 * - etc.
 * @author Erwin
 *
 */
public class ProductsMenuSteps {
	
	public ProductsMenuSteps(){
		myPage = PageProvider.getDeveloperHomePage();
	}
	
	private Page myPage = null;

	@When("^I click on the sports item in the products menu$")
	public void i_click_on_the_sports_item_in_the_products_menu() throws Throwable {
		myPage.clickMenuItemSports();
	}

	@When("^I click on the realtime maps item in the product menu$")
	public void i_click_on_the_product_menu_realtime_maps() throws Throwable {
		myPage.clickMenuItemRealTimeMaps();
	}
	
	@Then("^I see the home item in the product menu (.*)$")
	public void i_see_the_product_menu_home(String visible) throws Throwable {
		assertTrue(myPage.hasMenuItemHome() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the online navigation item in the product menu (.*)$")
	public void i_see_the_product_menu_online_navigation(String visible) throws Throwable {
		assertTrue(myPage.hasMenuItemOnlineNavigation() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the navigation software item in the product menu (.*)$")
	public void i_see_the_product_menu_navigation_software(String visible) throws Throwable {
		assertTrue(myPage.hasMenuItemNavigationSoftware() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the realtime maps item in the product menu (.*)$")
	public void i_see_the_product_menu_realtime_maps(String visible) throws Throwable {
		assertTrue(myPage.hasMenuItemRealTimeMaps() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the bridge item in the product menu (.*)$")
	public void i_see_the_product_menu_bridge(String visible) throws Throwable {
		assertTrue(myPage.hasMenuItemBridge() == Boolean.parseBoolean(visible));
	}

	@Then("^I see the sports item in the product menu (.*)$")
	public void i_see_the_product_menu_sports(String visible) throws Throwable {
		assertTrue(myPage.hasMenuItemSports() == Boolean.parseBoolean(visible));
	}
}
