package test.java;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * This class is there to run the latest feature that we are working on now
 * 
 * @author Erwin
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources/features/test")
public class TestNewFeature {
	// No code needed here
	// This tests executes all the features in the profiles directory
}
