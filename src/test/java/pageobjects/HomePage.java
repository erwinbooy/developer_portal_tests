package test.java.pageobjects;

import org.openqa.selenium.WebDriver;

/**
 * This page is for the home page. 
 * Note that there is not really a home page but it will just be the default for entering the website
 * @author Erwin
 *
 */
public class HomePage extends AbstractPage {

	// Url
	private static String myPageUrl = "http://developer.tomtom.com/";

	/**
	 * Constructor from the Abstract Class
	 * 
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Open our page
	 */
	public void OpenPage() {
		driver.get(myPageUrl);
	}
}
