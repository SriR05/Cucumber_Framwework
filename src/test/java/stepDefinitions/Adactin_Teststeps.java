package stepDefinitions;

import java.time.Duration;
import org.junit.Assert;
import Cucumber.Cucumber_Framwork.Cucumber_Base;
import helperPackage.Adactin_FileReaderManager;
import helperPackage.Adactin_PageObjManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_Teststeps extends Cucumber_Base {

	Adactin_PageObjManager pOM = new Adactin_PageObjManager(driver);

	@Given("Adactin Webpage Launched")
	public void adactin_webpage_launched() throws Throwable {
		getUrl(Adactin_FileReaderManager.getInstance().getAcrInstance().getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
	@When("User entre Username in Username fied")
	public void user_entre_username_in_username_fied() throws Throwable {
		inputElements(pOM.getLogin().getUsrN(),Adactin_FileReaderManager.getInstance().getAcrInstance().userName());
	}

	@When("User entre Password in Password field")
	public void user_entre_password_in_password_field()throws Throwable {
		inputElements(pOM.getLogin().getPsW(),Adactin_FileReaderManager.getInstance().getAcrInstance().passWord());
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button()throws Throwable {
		click(pOM.getLogin().getLogin());
	}
	@Then("Users credentials gets verified")
	public void users_credentials_gets_verified() {
		if ((pOM.getLogin().getUsrN()==pOM.getLogin().getUsrN())) {
			System.out.println("passUsrn");
		}
		else if ((pOM.getLogin().getUsrN()!=pOM.getLogin().getUsrN())) {
			System.out.println("failUsrn");
		}
	}
	@When("User selects preffered details")
	public void user_selects_preffered_details()throws Throwable {
		selectInd(pOM.getSearch().getHotelLoc(),6);
		selectValue(pOM.getSearch().getnHotel(), "Hotel Hervey");
		selectInd(pOM.getSearch().getRtype(),4);
		selectValue(pOM.getSearch().getrNo(), "2");
		clear(pOM.getSearch().getChIn());
		inputElements(pOM.getSearch().getChIn(),"06/03/2022");
		clear(pOM.getSearch().getChOut());
		inputElements(pOM.getSearch().getChOut(),"11/03/2022");
		selectVisi(pOM.getSearch().getaRoom(), "2 - Two");
		selectVisi(pOM.getSearch().getcRoom(), "1 - One");	
	}
	public static void valid(Adactin_PageObjManager pOM) {
		String expected = "pOM.getSearch().getHotelLoc()";
		String actual = "pOM.getSearch().getHotelLoc()";
		
		Assert.assertEquals(expected, actual);
		if(expected==actual) {
			System.out.println("equal");
		}
   
	}
	
	@Then("User enter the search button")
	public void user_enter_the_search_button() {
		click(pOM.getSearch().getSubBtn());
	}
	@When("User navigated to Select Hotel page")
	public void user_navigated_to_select_hotel_page()throws Throwable {
		click(pOM.getSelect().getRadBtn());
	}

	@When("Selects the preffered hotel")
	public void selects_the_preffered_hotel() throws Throwable{

		System.out.println("selected");
	}
	@Then("User clicks continue button")
	public void user_clicks_continue_button()throws Throwable {
		click(pOM.getSelect().getMoveFrd());
	}
	@When("User entres details")
	public void user_entres_details()throws Throwable {
		inputElements(pOM.getBook().getfName(),"Srilakshmi");
		inputElements(pOM.getBook().getlName(),"R");
		inputElements(pOM.getBook().getAddressDetail(),"OMR,Chennai-6000025");
		inputElements(pOM.getBook().getCardNo(),Adactin_FileReaderManager.getInstance().getAcrInstance().ccNo());
		selectInd(pOM.getBook().getCardType(),3);
		selectValue(pOM.getBook().getExpMon(),"5");
		selectValue(pOM.getBook().getExpYr(),"2022");
		inputElements(pOM.getBook().getCvvNo(),Adactin_FileReaderManager.getInstance().getAcrInstance().cvvNo());
	}
	@When("clicks on the Book Now button")
	public void clicks_on_the_book_now_button()throws Throwable {
		click(pOM.getBook().getNowBtn());
		
	}
	@Then("Users credentials are verified")
	public void users_credentials_are_verified() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
	}
	@Then("shown the hotel booked information")
	public void shown_the_hotel_booked_information()throws Throwable {
//		(pOM.getBook().getScreenShot1());
	}
	@When("User clicks on the Logout icon provided on the right top corner in blue colour")
	public void user_clicks_on_the_logout_icon_provided_on_the_right_top_corner_in_blue_colour()throws Throwable {
		click(pOM.getLogout().getOutBtn());
	}
	@Then("User is navigated to logged out page")
	public void user_is_navigated_to_logged_out_page()throws Throwable {
		screenShot(pOM.getLogout().getClickBtn());
		driver.quit();          
	}

}
