package test.java.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * This is the page you get after you click on the Online Navigation menu item
 * @author Erwin
 *
 */
public class RealTimeMapsPage extends AbstractPage {

	// Sidebar navigation links
	private static String sidebar_id = "id('sub')";
	private static String sidebar_item = "/ul/li//a";
	public static String sidebar_sub_item = "/ul/ul/li/a";

	// sidebar items
	private static String sidebar_overview = "[text()='Overview']";
	private static String sidebar_nds_map_updates = "[text()='NDS Map Updates']";
	private static String sidebar_map_input_tracker = "[text()='Map Input Tracker']";
	private static String sidebar_Traffic_Services = "[text()='Traffic Services']";

	// sidebar sub-items
	private static String sidebar_request_access = "[text()='Request access']";
	private static String sidebar_documentation = "[text()='Documentation']";
	private static String sidebar_download = "[text()='Download']";
	private static String sidebar_faq = "[text()='FAQ']";
	
	/**
	 * Constructor from the Abstract Class
	 * 
	 * @param driver
	 */
	public RealTimeMapsPage(WebDriver driver) {
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
}
