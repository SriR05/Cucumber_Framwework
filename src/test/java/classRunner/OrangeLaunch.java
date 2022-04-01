package classRunner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Cucumber.Cucumber_Framwork.Cucumber_Base;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/srilakshmi/eclipse-workspace/Cucumber.fram/src/main/resources/Features/OrangeLaunch.feature",
glue="stepDefinitions",
dryRun = false,monochrome = false,plugin = "pretty")

public class OrangeLaunch {
	public static WebDriver driver;
@BeforeClass
public static void setup() {driver = Cucumber_Base.getBrowser("chrome");}}
