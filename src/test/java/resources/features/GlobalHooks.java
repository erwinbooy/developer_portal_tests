package test.java.resources.features;

import cucumber.api.java.Before;
import test.java.helpers.PageProvider;

/**
 * Here we keep all the Hooks that we need for controlling our scripts
 * This hook is a dirty hack to control our browser for the suite
 * We are waiting for a nice global hook for cucumber to solve this nicely
 * @author Erwin
 *
 */
public class GlobalHooks{
	
	private static PageProvider session = new PageProvider();
    
    @Before("@web")
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void beforeAll(){
    	if(session.isBrowserRunning() == false){
        	PageProvider.init();
        	
            Runtime.getRuntime().addShutdownHook(new Thread(){
            	public void run(){
            		PageProvider.tearDown();
            	}
            }); 
    	}
    }
}