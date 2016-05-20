package test.java.helpers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import test.java.modules.profiles.Profile;
import test.java.modules.profiles.Profile1;
import test.java.modules.profiles.Profile2;
import test.java.modules.profiles.Roles;
import test.java.modules.profiles.User;

/**
 * Class to read the file with test data The file itself is excluded from the
 * repository for security reasons
 * 
 * @author Erwin
 *
 */
public class TestUsers {

	// The program runs from the /bin/ so that is our user.dir
	private static String running_dir = System.getProperty("user.dir");
	private static String testuser_file = null;
	private static List<User> myUsers = null;

	private static Log logger = LogFactory.getLog("Article Writer");

	/**
	 * This method will get all the articleUrls from the database
	 * 
	 * @return List<String> with articleUrls
	 */
	public static List<User> getAllTestUsers() {
		if (myUsers == null) {
			ArrayList<User> users = new ArrayList<User>();
			BufferedReader dbReader = null;
			String line = null;
			String fields[] = null;
			try {
				testuser_file = running_dir + "\\testusers.csv";
				dbReader = new BufferedReader(new FileReader(testuser_file));
				while ((line = dbReader.readLine()) != null) {
					fields = line.split(",");
					User user = new User();
					user.setUserid(fields[0]);
					user.setUserpwd(fields[1]);
					user.setUsername(fields[2]);
					if (fields[3].equals("1")) {
						user.setProfile(new Profile1());
					} else {
						user.setRole(Roles.valueOf(fields[3]));
					}
					users.add(user);
				}
				// put the users in the static variable for quick reference
				myUsers = users;
			} catch (IOException ioe) {
				logger.error(ioe);
			} finally {
				try {
					dbReader.close();
				} catch (Exception e) {
					logger.warn("Exception while trying to close the file reader");
				}
			}
		}
		return myUsers;
	}

	/**
	 * Method to get a user. If it is not available it will get it from file
	 * 
	 * @return
	 */
	public static User getUserWithRole(Enum<Roles> role) throws Exception {
		// If we don't have a user yet we will get one from our file
		if (myUsers == null) {
			// Let's find a user with this role for our test
			myUsers = TestUsers.getAllTestUsers();
		}
		// Now find the first user we can that has this role
		Iterator<User> iter = myUsers.iterator();
		while (iter.hasNext()) {
			User u = iter.next();
			if (u.getRole() == role) {
				return u;
			}
		}
		// Obviously we didn't find any user with that role
		return null;
	}

	/**
	 * Method to get a user. If it is not available it will get it from file
	 * 
	 * @return
	 */
	public static User getUserWithRoleNbr(int role) throws Exception {
		// If we don't have a user yet we will get one from our file
		if (myUsers == null) {
			// Let's find a user with this role for our test
			myUsers = TestUsers.getAllTestUsers();
		}
		// Now find the first user we can that has this role
		Iterator<User> iter = myUsers.iterator();
		while (iter.hasNext()) {
			User u = iter.next();
			if(role==1){
				if (u.getProfile().getClass().equals(Profile1.class)) {
					return u;
				}
			} else {
				if (u.getProfile().getClass().equals(Profile2.class)) {
					return u;
				}
			}
		}
		// Obviously we didn't find any user with that role
		return null;
	}
}
