package test.java.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageProvider {

	private static WebDriver driver = null;

	/**
	 * @param WebDriver
	 * @param WebDriverWait
	 */
	private static void getDriver() {
		// We only want to get the driver once
		if (driver == null) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}

	public static HomePage getDeveloperHomePage() {
		getDriver();
		return new HomePage(driver);
	}

	public static LoginPage getLoginPage() {
		getDriver();
		return new LoginPage(driver);
	}

	public static OnlineNavigationPage getOnlineNavigationPage() {
		getDriver();
		return new OnlineNavigationPage(driver);
	}

	public static NavigationSoftwarePage getNavigationSoftwarePage() {
		getDriver();
		return new NavigationSoftwarePage(driver);
	}

	public static void tearDown() {
		driver.quit();
	}
}
