package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue= {"stepDefinitions"},dryRun = false)
public class Runner {

}
