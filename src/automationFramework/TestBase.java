package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;

public abstract class TestBase extends TestCase {

	private FirefoxDriver myDriver;
	
	/**
	 * setUp method which is used by the Test framework
	 */
	public void setUp() {
		myDriver = new FirefoxDriver();
		//myDriver = new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		myDriver.manage().window().maximize();
		PageProvider.initialize(myDriver);
	}

	/**
	 * @return WebDriver
	 */
	public WebDriver getDriver() {
		return myDriver;
	}

	/**
	 * Always make sure we close the driver at the end of the test
	 */
	public void tearDown() throws Exception {
		myDriver.quit();
	}
}