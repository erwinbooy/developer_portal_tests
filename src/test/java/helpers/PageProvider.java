package test.java.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import test.java.pageobjects.HomePage;
import test.java.pageobjects.LoginPage;
import test.java.pageobjects.NavigationSoftwarePage;
import test.java.pageobjects.OnlineNavigationPage;

public class PageProvider {

	private static WebDriver driver = null;

	public static void init() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
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

	public static void tearDown() {
		driver.quit();
	}
}
