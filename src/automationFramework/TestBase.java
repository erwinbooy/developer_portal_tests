package automationFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;

public abstract class TestBase extends TestCase {

	private FirefoxDriver myDriver;


	/**
	 * We create this rule to have a screenshot in case the test fails
	 */
    @Rule
    public TestRule screenshotRule = new TestWatcher() {
    	
        @Override
        protected void failed(Throwable e, org.junit.runner.Description description) {
            captureScreenshot(description.getMethodName());
        }
        
        private void captureScreenshot(String name) {
            File screenshot = ((TakesScreenshot) myDriver)
                    .getScreenshotAs(OutputType.FILE);
            String path = "./target/screenshots/" + name +"_"+ screenshot.getName();
            try {
                FileUtils.copyFile(screenshot, new File(path));
            } catch (IOException e) {

            }
        }
    };
	
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