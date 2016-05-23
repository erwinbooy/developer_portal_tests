package test.java.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This is the page you get after you click on the Navigation Software menu item
 * @author Erwin
 *
 */
public class NavigationSoftwarePage extends AbstractPage {

	// Sidebar navigation links
	private static String sidebar_navkit = "[text()='NavKit']";
	private static String sidebar_sub_item = "/ul/ul/li/a";
	private static String sidebar_documentation = "[text()='Documentation']";
	private static String sidebar_downloads = "[text()='Downloads']";
	private static String sidebar_faq = "[text()='FAQ']";
	private static String sidebar_integration_kit = "[text()='Integration Kit']";

	/**
	 * Constructor from the Abstract Class
	 * 
	 * @param driver
	 */
	public NavigationSoftwarePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Check if the sidebar NavKit is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemNavKit() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_navkit));
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
	 * Check if the sidebar Downloads is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemDownloads() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_sub_item + sidebar_downloads));
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
	 * Check if the sidebar Integration Kit is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemInegrationKit() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_sub_item + sidebar_integration_kit));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}
}
