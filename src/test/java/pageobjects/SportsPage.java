package test.java.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * This is the page you get after you click on the Online Navigation menu item
 * @author Erwin
 *
 */
public class SportsPage extends AbstractPage {

	private static String sidebar_overview = "[text()='Overview']";
	private static String sidebar_camera_media_server = "[text()='Camera Media Server']";
	private static String sidebar_mysports_cloud = "[text()='MySports Cloud']";
	private static String sidebar_mysports_sub_item = "/ul/li/ul/li/a";

	// Sidebar navigation sub links
	private static String sidebar_authorization = "[text()='Authorization']";
	private static String sidebar_documentation = "[text()='Documentation']";
	private static String sidebar_faq = "[text()='FAQ']";
	private static String sidebar_forum = "[text()='Forum']";
	private static String sidebar_terms_of_use = "[text()='Terms of Use']";
	private static String sidebar_api_guidelines = "[text()='API guidelines']";
	private static String sidebar_sensor_data_format = "[text()='Sensor Data Format']";
	private static String sidebar_tags_highlights_format = "[text()='Tags/Highlights Format']";

	/**
	 * Constructor from the Abstract Class
	 * 
	 * @param driver
	 */
	public SportsPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Click on the sidebar item MySports cloud
	 * 
	 * @return
	 */
	public void clickSideBarItemMySportsCloud() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_mysports_cloud)).click();
		} catch (Exception ex) {
			// We didn't find the element which is strange but we ignore it
		}
	}

	/**
	 * Click on the sidebar item MySports cloud
	 * 
	 * @return
	 */
	public void clickSideBarItemCameraMediaServer() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_item + sidebar_camera_media_server)).click();
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

	/**
	 * Check if the sidebar sub item Authorization is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarSubItemAuthorization() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_mysports_sub_item + sidebar_authorization));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar sub item Documentation is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarSubItemDocumentation() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_sub_item + sidebar_documentation));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar sub item Documentation is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarSubItemMySportsDocumentation() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_mysports_sub_item + sidebar_documentation));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar sub item FAQ is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarSubItemFAQ() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_mysports_sub_item + sidebar_faq));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar sub item Forum is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarSubItemForum() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_mysports_sub_item + sidebar_forum));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar sub item Terms of Use is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarSubItemTermsOfUse() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_mysports_sub_item  + sidebar_terms_of_use));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar sub item API Guidelines is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarSubItemApiGuidelines() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_sub_item + sidebar_api_guidelines));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar sub item Sensor Data Format is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarSubItemSensorDataFormat() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_sub_item + sidebar_sensor_data_format));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}

	/**
	 * Check if the sidebar sub item Tags/Highlights Format is showing
	 * 
	 * @return
	 */
	public boolean hasSideBarSubItemTagsHighlightsFormat() {
		try {
			findElementOnPage(By.xpath(sidebar_id + sidebar_sub_item + sidebar_tags_highlights_format));
			return true;
		} catch (Exception ex) {
			// We didn't find the element
		}
		return false;
	}
}
