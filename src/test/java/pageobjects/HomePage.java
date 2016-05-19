package test.java.pageobjects;

import org.openqa.selenium.WebDriver;

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
