package test.java.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import test.java.pageobjects.HomePage;
import test.java.pageobjects.LoginPage;
import test.java.pageobjects.NavigationSoftwarePage;
import test.java.pageobjects.OnlineNavigationPage;
import test.java.pageobjects.SportsPage;

public class PageProvider {

	private static WebDriver driver = null;
	private static boolean browser = false;

	public static void init() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		browser = true;
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
	
	public static SportsPage getSportsPage(){
		return new SportsPage(driver);
	}

	public static void tearDown() {
		driver.quit();
		browser = false;
	}
	
	/**
	 * See if the browser is already running
	 * @return
	 */
	public boolean isBrowserRunning(){
		return browser;
	}
}
