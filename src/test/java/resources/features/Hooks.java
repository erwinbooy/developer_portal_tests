package test.java.resources.features;

import java.net.MalformedURLException;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import test.java.helpers.PageProvider;

/**
 * Here we keep all the Hooks that we need for controlling our scripts
 * The hooks are tagged so you can indicate for which test you want to perform them
 * For now the hooks only regulate the browser session 
 * @author Erwin
 *
 */
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