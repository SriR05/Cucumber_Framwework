package classRunner;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/srilakshmi/eclipse-workspace/Cucumber.fram/src/main/resources/Features/OrangeHRM.feature",
glue="stepDefinitions",
dryRun = false,monochrome = false,plugin = "pretty")

public class Orangehrm {
	public static WebDriver driver;


}

