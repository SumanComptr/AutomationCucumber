package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features = ".//Features/Purchase.feature", 
glue = "StepDefination", 
dryRun = false, monochrome = false,
plugin = {
		"pretty", "html:target/Cucumber-report/Purchase.html" })


public class Testrun {

}
