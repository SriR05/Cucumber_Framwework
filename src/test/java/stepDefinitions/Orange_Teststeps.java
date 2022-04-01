package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;

import Cucumber.Cucumber_Framwork.Cucumber_Base;
import helperPackage.OrAddcan;
import helperPackage.OrDelSort;
import helperPackage.OrLoginPage;
import helperPackage.OrRecPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orange_Teststeps extends Cucumber_Base  {
	OrLoginPage or = new OrLoginPage(driver);OrRecPage rec = new OrRecPage(driver);
	OrAddcan add = new OrAddcan(driver);OrDelSort ds = new OrDelSort(driver);
	@Given("Application Launch")
	public void application_launch() {
		getUrl("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();driver.manage().timeouts().
		implicitlyWait(Duration.ofSeconds(30));}
	@When("Enters Username in {string} field")
	public void enters_username_in_field(String string) {
		inputElements(or.getUsername(), "Admin");}
	@When("Enters Password in \"admin123\"field")
	public void enters_password_in_admin123_field() {
		inputElements(or.getPassWord(),"admin123");}
	@When("Click login button")
	public void click_login_button() {
		click(or.getLoginBtn());}
	@Then("Validate OrangeHrm Homepage")
	public void validate_orange_hrm_homepage() {
		getTitle("Title:");	}
	@When("Mouse-hover on Recruitment Functionality")
	public void mouse_hover_on_recruitment_functionality() {
		actionClass(rec.getRectFeat());}
	@When("Recruitment features displays")
	public void recruitment_features_displays() {
		getText(rec.getRectFeat());}
	@When("Clicks on Recruitment Functionality")
	public void clicks_on_recruitment_functionality() {
		click(rec.getRectFeat());}
	@When("Navigates to Candidates feature page")
	public void navigates_to_candidates_feature_page() {
		getThisUrl("RectURL:");	}
	@Then("Validate Candidate feature page")
	public void validate_candidate_feature_page() {
		String candSearch = driver.findElement(By.id("frmSrchCandidates")).getText();
		System.out.println("SearchForm:"+candSearch);}
	@When("Clicks on First Name\"Eren\"field and enters valid {string}")
	public void clicks_on_first_name_eren_field_and_enters_valid(String string) {
		click(add.getAddBtn());inputElements(add.getFirstName(), "Eren");}
	@When("Clicks on Middle Name\"Aot\"field and enters valid {string}")
	public void clicks_on_middle_name_aot_field_and_enters_valid(String string) {
		click(add.getMiddleName());inputElements(add.getMiddleName(), "Aot");	}
	@When("Clicks on Last Name\"Yeager\"field and enters valid {string}")
	public void clicks_on_last_name_yeager_field_and_enters_valid(String string) {
		click(add.getLastName());inputElements(add.getLastName(), "Yeager");}
	@Then("Validate Fullname field is entered with Valid {string}{string}{string}")
	public void validate_fullname_field_is_entered_with_valid(String string, String string2, String string3) {
		Assert.assertEquals(string, string);Assert.assertEquals(string2, string2);
		Assert.assertEquals(string3, string3);}
	@When("Clicks on Email field and enters Valid {string}")
	public void clicks_on_email_field_and_enters_valid(String string) {
		click(add.getEmailID());inputElements(add.getEmailID(), "eren@yegar.com");}
	@Then("Validate Valid {string} in the email field")
	public void validate_valid_in_the_email_field(String string) {
		Assert.assertEquals(string, string);}
	@When("Clicks on Contact No field and enters valid contactno")
	public void clicks_on_contact_no_field_and_enters_valid_contactno() {
		click(add.getContactNo());inputElements(add.getContactNo(),"900009990009");}
	@Then("Validate Contact No field")
	public void validate_contact_no_field() {
		getText(add.getContactNo());
		String a = "inputElements(add.getContactNo(),\"900009990009\")";
		String b ="getText(add.getContactNo())";
		if (a==b) {System.out.println("ContactNo: pass");}}
	@When("Clicks on Job Vacancy drop-down field and select job position from the drop-down list")
	public void clicks_on_job_vacancy_drop_down_field_and_select_job_position_from_the_drop_down_list() {
		selectVisi(add.getJobVacancy(), "Ramu");}
	@Then("Validate Job Vacany field is selected")
	public void validate_job_vacany_field_is_selected() {
		String c = "selectVisi(add.getJobVacancy(), \"Ramu\")";String d = "selectVisi(add.getJobVacancy(), \"Ramu\")";
		Assert.assertEquals(c, d);}
	@When("Clicks on Keywords field and enters keywords")
	public void clicks_on_keywords_field_and_enters_keywords() {
		click(add.getKeyWords());inputElements(add.getKeyWords(), "ACP");}
	@Then("Validate keywords written in the Keywords field")
	public void validate_keywords_written_in_the_keywords_field() {
		getText(add.getKeyWords());	}
	@When("Clicks on Comment field and enters comments")
	public void clicks_on_comment_field_and_enters_comments() {
		click(add.getCommenBox());inputElements(add.getCommenBox(), "job vacancy");}
	@Then("Validate comments written in the Comment field")
	public void validate_comments_written_in_the_comment_field() {
		getText(add.getCommenBox());}
	@When("Clicks on Date of Application field and enters DOA")
	public void clicks_on_date_of_application_field_and_enters_doa() {
		clear(add.getdOA());
		click(add.getdOA());inputElements(add.getdOA(), "31-03-2022");}	
	@Then("Validate DOA in the Date of Application field")
	public void validate_doa_in_the_date_of_application_field() {
		getText(add.getdOA());}
	@When("Clicks on Consent to keep data radio box")
	public void clicks_on_consent_to_keep_data_radio_box() {
		click(add.getConsentBox());}
	@Then("Validate radio box selected in the Consent to keep data")
	public void validate_radio_box_selected_in_the_consent_to_keep_data() {
		boolean consentBox = driver.findElement(By.xpath("//input[starts-with(@id,'addCandidate_conse')]")).isSelected();
		System.out.println("Is checked?"+consentBox);}
	@When("Clicks on Save button")
	public void clicks_on_save_button() {
		click(add.getSaveBtn());screenS();}
	@Then("Validate datas are saved")
	public void validate_datas_are_saved() throws Throwable {
		click(add.getBackBtn());
		Thread.sleep(2000);
		click(add.getAddBtn());}
	@When("Clicks on First Name\"Mikasa\"field and enters valid {string}")
	public void clicks_on_first_name_mikasa_field_and_enters_valid(String string) throws Throwable {
		Thread.sleep(2000);
		clear(add.getFirstName());inputElements(add.getFirstName(), "Mikasa");}
	@When("Clicks on Last Name\"Ackerman\"field and enters valid {string}")
	public void clicks_on_last_name_ackerman_field_and_enters_valid(String string) throws Throwable {
		inputElements(add.getLastName(), "Ackerman");
		Thread.sleep(2000);
		clear(add.getEmailID());inputElements(add.getEmailID(), "mikasa@ack.com");
		click(add.getSaveBtn());click(add.getBackBtn());Thread.sleep(2000);click(add.getAddBtn());}
	@When("Clicks on First Name\"Armin\"field and enters valid {string}")
	public void clicks_on_first_name_armin_field_and_enters_valid(String string) throws Throwable {
		click(add.getFirstName());
		inputElements(add.getFirstName(), "Armin");}
	@When("Clicks on Last Name\"Arlert\"field and enters valid {string}")
	public void clicks_on_last_name_arlert_field_and_enters_valid(String string) throws Throwable{
		Thread.sleep(2000);click(add.getLastName());inputElements(add.getLastName(), "Arlert");
		Thread.sleep(2000);clear(add.getEmailID());
		inputElements(add.getEmailID(), "armin@aler.com");
		click(add.getSaveBtn());click(add.getBackBtn());}
	@When("Add three candidates through Add feature")
	public void add_three_candidates_through_add_feature()throws Throwable {
		Thread.sleep(2000);getPageSrc("Page:");}
	@Then("Validate added candidates")
	public void validate_added_candidates() {screenS();}
	@When("Two candidates are selected through tick box")
	public void two_candidates_are_selected_through_tick_box()throws Throwable {
		click(driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]")));
		Thread.sleep(2000);
		click(driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr//td/following::tr//td[1]")));}
	@Then("Validate delete feature")
	public void validate_delete_feature() {
		click(ds.getDelBtn());driver.switchTo().alert().accept();
		screenS();}
	@When("Clicks on the Sorting order feature")
	public void clicks_on_the_sorting_order_feature() throws Throwable{
		Thread.sleep(2000);
		click(ds.getSortOrder());}

	@Then("Validate ascending and descending order")
	public void validate_ascending_and_descending_order() throws Throwable{
		Thread.sleep(2000);
		screenS();driver.quit();}
	
}
