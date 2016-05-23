package test.java.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * This is the page you get after you click on the Online Navigation menu item
 * @author Erwin
 *
 */
public class OnlineNavigationPage extends AbstractPage {

	// Sidebar navigation links
	private static String sidebar_overview = "[text()='Overview']";
	private static String sidebar_online_routing = "[text()='Online Routing']";
	private static String sidebar_online_maps = "[text()='Online Maps']";
	private static String sidebar_online_search = "[text()='Online Search']";
	private static String sidebar_online_traffic = "[text()='Online Traffic']";
	private static String sidebar_maps_sdk = "[text()='Maps SDK']";
	private static String sidebar_request_access = "[text()='Request access']";
	private static String sidebar_api_explorer = "[text()='API Explorer']";

	/**
	 * Constructor from the Abstract Class
	 * 
	 * @param driver
	 */
	public OnlineNavigationPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Check if the sidebar overview link is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemOverview() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_overview));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar online routing link is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemOnlineRouting() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_online_routing));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar online maps link is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemOnlineMaps() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_online_maps));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar online search link is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemOnlineSearch() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_online_search));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar online traffic link is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemOnlineTraffic() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_online_traffic));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar maps sdk link is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemMapsSDK() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_maps_sdk));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar request access link is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemRequestAccess() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_request_access));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar api explorer link is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemApiExplorer() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_api_explorer));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}
}
