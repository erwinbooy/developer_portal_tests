package profiles;

import pages.NavigationSoftwarePage;
import pages.OnlineNavigationPage;
import pages.Page;

/**
 * Developer Profile one
 * 
 * Should have Account link
 * Should have Dashboard link
 * 
 * @author Erwin
 *
 *  Menu links
 *  - My Account			Yes
 *  - Dashboard				Yes
 *  
 *  Menu items
 *  - Home					Yes
 *  - Online Navigation		Yes
 *  - Navigation Software	Yes
 *  - Real-Time Maps		Yes
 *  - Bridge				Yes	
 *  - Sports				Yes
 *  
 *  Sidebar Online Navigation
 *  - Overview				Yes
 *  - Online Routing		Yes
 *  - Online Maps			Yes
 *  - Online Search			Yes
 *  - Online Traffic		Yes
 *  - Maps SDK				Yes
 *  - Request Access		Yes
 *  - API Explorer			Yes
 *  
 *  Sidebar Navigation Software
 *  - Navkit				Yes
 *  - Downloads				Yes
 *  - FAQ					Yes
 *  - Integration Kit		Yes
 *  
 *  Sidebar Real-Time Maps
 *  - Overvew				Yes
 *  - NDS Map Updates		Yes
 *  - Map Input Tracker		Yes
 *  - Traffic Services		Yes
 *  
 *  Sidebar Bridge
 *  - A lot!!!				Yes
 *  
 *  Sidebar Sports
 *  - Overview				Yes
 *  - Camera Media Server	Yes
 *  - MySports Cloud		Yes
 *  
 *  Footer
 *  - Customer Support		Yes
 */
public class Profile1 extends AbstractProfile{
	
	/**
	 * We will use the basic logic from the Abstract class
	 */
	public boolean isLoggedIn(User myUser, Page myPage) {
		return super.isLoggedIn(myUser, myPage);
	}

	/**
	 * Method that checks if this profile has the correct links
	 *  
	 * @return true/false
	 */
	public boolean hasCorrectLinks(User user, Page myPage){
		return super.hasCorrectLinks(user, myPage, true, true);
	}

	/**
	 * Method that checks if this profile has the correct menu items
	 *  
	 * @return true/false
	 */
	public boolean hasCorrectMenuItems(User user, Page myPage){
		return super.hasCorrectMenuItems(user, myPage, true, true, true, true, true, true);
	}

	/**
	 * Method that checks if this profile has the correct sidebar items
	 *  
	 * @return true/false
	 */
	public boolean hasCorrectSideBarItemsON(User user, OnlineNavigationPage myPage){
		return super.hasCorrectSidebarItemsON(user, myPage, true, true, true, true, true, true, true, true);
	}

	/**
	 * Method that checks if this profile has the correct sidebar items
	 *  
	 * @return true/false
	 */
	public boolean hasCorrectSideBarItemsNS(User user, NavigationSoftwarePage myPage){
		return super.hasCorrectSidebarItemsNS(user, myPage, true, true, true, true, true);
	}
}
