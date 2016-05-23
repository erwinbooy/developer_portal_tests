package test.java;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * This class contains the tests for a user with Profile 1
 * 
 * @author Erwin
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources/features/roles")
public class TestUserRoles {
	// No code needed here
	// This tests executes all the features in the profiles directory
}
