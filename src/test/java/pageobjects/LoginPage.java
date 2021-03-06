package test.java.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.java.modules.users.User;

/**
 * This Page is for the login details screen that you get after you click the Sign in link
 * @author Erwin
 *
 */
public class LoginPage extends AbstractPage {

	// private String myPageUrl =
	// "https://secure.mashery.com/login/developer.tomtom.com/";
	private static String field_userid = "handle";
	private static String field_userpwd = "passwd";
	private static String button_signin = "process-login";

	/**
	 * Constructor from the Abstract Class
	 * 
	 * @param driver
	 */
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Enter user credentials and click SignIn
	 */
	public void signIn(User user) throws Exception{
		try{
			// Lets see if we can login
			trySignIn(user);
		} catch (Exception nologin){
			// It seems we couldn't login. Usually this means we are already logged in
			// so lets login and try it again. If that fails we don't know what the problem is
			signOut();
			trySignIn(user);
		}
	}
	
	public void signOut(){
		clickSignOut();
	}
	
	private void trySignIn(User user) throws Exception{
		waitForElementPresent(By.id("handle"));
		WebElement userName = findElementOnPage(By.id(field_userid));
		userName.sendKeys(user.getUserid());
		WebElement userPwd = findElementOnPage(By.id(field_userpwd));
		userPwd.sendKeys(user.getUserpwd());
		// Now press the Sign in button
		WebElement signInButton = findElementOnPage(By.id(button_signin));
		signInButton.click();
	}
}
