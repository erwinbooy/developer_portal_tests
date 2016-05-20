package test.java.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * This is the page you get after you click on the Online Navigation menu item
 * @author Erwin
 *
 */
public class SportsPage extends AbstractPage {

	// Sidebar navigation links
	private static String sidebar_id = "id('sub')";
	private static String sidebar_item = "/ul/li//a";
	private static String sidebar_overview = "[text()='Overview']";
	private static String sidebar_camera_media_server = "[text()='Camera Media Server']";
	private static String sidebar_mysports_cloud = "[text()='MySports Cloud']";

	/**
	 * Constructor from the Abstract Class
	 * 
	 * @param driver
	 */
	public SportsPage(WebDriver driver) {
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
	 * Check if the sidebar overview link is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemCameraMediaServer() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_camera_media_server));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar overview link is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarItemMySportsCloud() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_mysports_cloud));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}
}
