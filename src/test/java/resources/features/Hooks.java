package test.java.resources.features;

import java.net.MalformedURLException;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import test.java.pageobjects.PageProvider;

public class Hooks{
    
    @Before("@web")
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void openBrowser() throws MalformedURLException {
    	PageProvider.init();
    }

    @After("@web")
    public void tearDown() {
    	PageProvider.tearDown();
    }
}