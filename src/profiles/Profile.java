package profiles;

import pages.NavigationSoftwarePage;
import pages.OnlineNavigationPage;
import pages.Page;

/**
 * Interface to be used for testing the Developer Profiles

 * @author Erwin
 */
public interface Profile {
	/**
	 * Check if the user is logged in
	 */
	public boolean isLoggedIn(User user, Page page);
	/**
	 * Check if the correct links are showing at the top
	 */
	public boolean hasCorrectLinks(User user, Page page);
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
