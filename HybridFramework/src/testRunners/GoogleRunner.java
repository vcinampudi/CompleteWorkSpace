package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:Reports/Google" }, features = { "Features" }, glue = { "com.StepDefs" })
public class GoogleRunner {

}
