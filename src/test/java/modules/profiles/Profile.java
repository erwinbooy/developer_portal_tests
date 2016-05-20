package test.java.modules.profiles;

import test.java.pageobjects.NavigationSoftwarePage;
import test.java.pageobjects.OnlineNavigationPage;
import test.java.pageobjects.Page;

/**
 * Interface to be used for testing the Developer Profiles
 * 
 * @author Erwin
 */
public interface Profile {

	/**
	 * Check if the correct links are showing at the top
	 */
	public boolean hasCorrectMenuLinks(User user, Page page);

	/**
	 * Check if the correct menu items are showing at the top
	 */
	public boolean hasCorrectMenuItems(User user, Page page);

	/**
	 * Check if the Sidebar items for the Online Navigation are correct
	 */
	public boolean hasCorrectSideBarItemsON(User user, OnlineNavigationPage page);

	/**
	 * Check if the Sidebar items for the Navigation Software are correct
	 */
	public boolean hasCorrectSideBarItemsNS(User user, NavigationSoftwarePage page);
}
