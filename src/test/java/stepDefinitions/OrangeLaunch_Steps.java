package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

import Cucumber.Cucumber_Framwork.Cucumber_Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeLaunch_Steps extends Cucumber_Base {
	@Given("User opens the browser")
	public void user_opens_the_browser() {
	driver.manage().window().maximize();}
	@Given("Enters OrangeHRM url")
	public void enters_orange_hrm_url() {
	getUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");}
	@Then("Application launches")
	public void application_launches() throws IOException {
	    TakesScreenshot launchpage = (TakesScreenshot) driver;
	    File src = launchpage.getScreenshotAs(OutputType.FILE);
	    File dsc = new File("/Users/srilakshmi/eclipse-workspace/Cucumber.fram/target//OrangeHRMlaunch.png");
		FileUtils.copyFile(src, dsc);}
	@When("User clicks f logo And navigates to Orange facebook page")
	public void user_clicks_f_logo_and_navigates_to_orange_facebook_page() throws IOException, InterruptedException {
	click(driver.findElement(By.xpath("//*[contains(@alt,'Facebook')]")));
	Set<String> window =driver.getWindowHandles();
	List<String> list = new ArrayList<String>(window);
	driver.switchTo().window(list.get(1));
	Thread.sleep(2000);
    TakesScreenshot Orfb = (TakesScreenshot) driver;
    File src = Orfb.getScreenshotAs(OutputType.FILE);
    File dsc = new File("/Users/srilakshmi/eclipse-workspace/Cucumber.fram/target//Orangefacebook.png");
	FileUtils.copyFile(src, dsc);
	driver.close();
	Set<String> window2 = driver.getWindowHandles();
	List<String> list1 = new ArrayList<String>(window2);
	driver.switchTo().window(list1.get(0));}

	@When("User clicks t logo And navigates to Orange twitter page")
	public void user_clicks_t_logo_and_navigates_to_orange_twitter_page() throws IOException, Throwable {
		click(driver.findElement(By.xpath("//*[contains(@alt,'twitter')]")));
		Set<String> window =driver.getWindowHandles();
		List<String> list = new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
	    TakesScreenshot Ortw = (TakesScreenshot) driver;
	    File src = Ortw.getScreenshotAs(OutputType.FILE);
	    File dsc = new File("/Users/srilakshmi/eclipse-workspace/Cucumber.fram/target//Orangetwitter.png");
		FileUtils.copyFile(src, dsc);
		driver.close();Set<String> window2 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(window2);
		driver.switchTo().window(list1.get(0));}

	@When("User clicks you tube logo And navigates to Orange you tube channel")
	public void user_clicks_you_tube_logo_and_navigates_to_orange_you_tube_channel() throws IOException, Throwable {
		click(driver.findElement(By.xpath("//*[contains(@alt,'youtube')]")));
		Set<String> window =driver.getWindowHandles();
		List<String> list = new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
	    TakesScreenshot OrUt = (TakesScreenshot) driver;
	    File src = OrUt.getScreenshotAs(OutputType.FILE);
	    File dsc = new File("/Users/srilakshmi/eclipse-workspace/Cucumber.fram/target//Orangeyoutube.png");
		FileUtils.copyFile(src, dsc);
		driver.close();Set<String> window2 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(window2);
		driver.switchTo().window(list1.get(0));}
	
	@When("User clicks in logo And navigates to Orange linkdin page")
	public void user_clicks_in_logo_and_navigates_to_orange_linkdin_page()throws IOException, Throwable {
		click(driver.findElement(By.xpath("//*[contains(@alt,'LinkedIn')]")));
		Set<String> window =driver.getWindowHandles();
		List<String> list = new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
	    TakesScreenshot OrIn = (TakesScreenshot) driver;
	    File src = OrIn.getScreenshotAs(OutputType.FILE);
	    File dsc = new File("/Users/srilakshmi/eclipse-workspace/Cucumber.fram/target//OrangeLinkedIn.png");
		FileUtils.copyFile(src, dsc);
		driver.close();Set<String> window2 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(window2);
		driver.switchTo().window(list1.get(0));}
	
	@When("User clicks all rights serverd link")
	public void user_clicks_all_rights_serverd_link()throws IOException, Throwable {
		click(driver.findElement(By.xpath("//*[contains(text(),'Inc')]")));
		Set<String> window =driver.getWindowHandles();
		List<String> list = new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
	    TakesScreenshot OrIn = (TakesScreenshot) driver;
	    File src = OrIn.getScreenshotAs(OutputType.FILE);
	    File dsc = new File("/Users/srilakshmi/eclipse-workspace/Cucumber.fram/target//OrangeLinkedIn.png");
		FileUtils.copyFile(src, dsc);
		driver.close();Set<String> window2 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(window2);
		driver.switchTo().window(list1.get(0));}

	

	@Then("Orange launch build features are perfomring")
	public void orange_launch_build_features_are_perfomring() {
	    Point location = driver.findElement(By.xpath("//div[@id='divLogo']//img")).getLocation();
	    System.out.println("Logo:"+location);
	    Dimension size = driver.findElement(By.xpath("//div[@id='divLoginImage']")).getSize();
	    System.out.println("login size"+size);
	 driver.quit();   
	}


}
