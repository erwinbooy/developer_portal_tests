package test.java;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * This class contains the tests for a user with Profile 1
 * @author Erwin
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/java/resources/features/profiles")
public class Profile1Test{
}
