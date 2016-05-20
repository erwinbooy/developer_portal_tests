package test.java.pageobjects;

import test.java.modules.profiles.User;

public interface Page {
	public boolean isLoggedIn(User user);
	
	public String getSignInText();

	public String getSignOutText();
	
	public boolean hasSignInLink();
	
	public boolean hasSignOutLink();
	
	public boolean hasRegisterLink();

	public boolean hasAccountLink();

	public boolean hasDashboardLink();

	public void clickMenuItemHome();

	public void clickMenuItemOnlineNavigation();

	public void clickMenuItemNavigationSoftware();

	public void clickMenuItemRealTimeMaps();

	public void clickMenuItemBridge();

	public void clickMenuItemSports();

	public boolean hasMenuItemHome();

	public boolean hasMenuItemOnlineNavigation();

	public boolean hasMenuItemNavigationSoftware();

	public boolean hasMenuItemRealTimeMaps();

	public boolean hasMenuItemBridge();

	public boolean hasMenuItemSports();
}
