package dev.portal.automationFramework;

import org.openqa.selenium.WebDriver;

import dev.portal.pages.HomePage;
import dev.portal.pages.LoginPage;
import dev.portal.pages.NavigationSoftwarePage;
import dev.portal.pages.OnlineNavigationPage;

public class PageProvider {

	private static WebDriver driver = null;

	/**
	 * @param WebDriver
	 * @param WebDriverWait
	 */
	public static void initialize(WebDriver driver) {
		PageProvider.driver = driver;
	}

	public static HomePage getDeveloperHomePage() {
		return new HomePage(driver);
	}

	public static LoginPage getLoginPage() {
		return new LoginPage(driver);
	}

	public static OnlineNavigationPage getOnlineNavigationPage() {
		return new OnlineNavigationPage(driver);
	}

	public static NavigationSoftwarePage getNavigationSoftwarePage() {
		return new NavigationSoftwarePage(driver);
	}
}
