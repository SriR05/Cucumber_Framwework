package classRunner;


import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Cucumber.Cucumber_Framwork.Cucumber_Base;
import helperPackage.Adactin_FileReaderManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/srilakshmi/eclipse-workspace/Cucumber.fram/src/main/resources/Features/Adact.feature",
glue="stepDefinitions",
dryRun=false,monochrome=false,plugin="pretty")
public class AdactinRunner {
	public static WebDriver driver;
	@BeforeClass()
	public static void setUp() throws IOException {
		String browser = Adactin_FileReaderManager.getInstance().getAcrInstance().getBrowser();
		driver = Cucumber_Base.getBrowser(browser);}}
	

