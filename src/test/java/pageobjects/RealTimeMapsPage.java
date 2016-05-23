package test.java.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * This is the page you get after you click on the Online Navigation menu item
 * @author Erwin
 *
 */
public class RealTimeMapsPage extends AbstractPage {

	// sidebar items
	private static String sidebar_overview = "[text()='Overview']";
	private static String sidebar_nds_map_updates = "[text()='NDS Map Updates']";
	private static String sidebar_map_input_tracker = "[text()='Map Input Tracker']";
	@SuppressWarnings("unused")
	private static String sidebar_Traffic_Services = "[text()='Traffic Services']";

	// sidebar sub-items
	private static String sidebar_sub_item = "/ul/li/ul/li/a";
	private static String sidebar_documentation = "[text()='Documentation']";
	private static String sidebar_download = "[text()='Download']";
	private static String sidebar_faq = "[text()='FAQ']";
	private static String sidebar_request_access = "[text()='Request access']";
	
	/**
	 * Constructor from the Abstract Class
	 * 
	 * @param driver
	 */
	public RealTimeMapsPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Click on the sidebar item Map Input Tracker
	 * 
	 * @return
	 */
	public void clickSideBarItemMapInputTracker() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_map_input_tracker)).click();
		} catch (Exception ex) {
			// We didn't find the element which is strange but we ignore it
		}
	}

	/**
	 * Click on the sidebar item NDS Map Updates
	 * 
	 * @return
	 */
	public void clickSideBarItemNdsMapUpdates() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_nds_map_updates)).click();
		} catch (Exception ex) {
			// We didn't find the element which is strange but we ignore it
		}
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
	 * Check if the sidebar Documentation is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemDocumentation() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_sub_item + sidebar_documentation));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar Download is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemDownload() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_sub_item + sidebar_download));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar FAQ is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemFAQ() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_sub_item + sidebar_faq));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar Request access is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemRequestAccess() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_sub_item + sidebar_request_access));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}
}
