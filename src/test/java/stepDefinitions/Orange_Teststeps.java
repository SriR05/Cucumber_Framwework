package stepDefinitions;


import java.time.Duration;

import Cucumber.Cucumber_Framwork.Cucumber_Base;
import helperPackage.Orange_PageObjManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orange_Teststeps extends Cucumber_Base  {
	Orange_PageObjManager op = new Orange_PageObjManager(driver);
	@Given("Application Launch")
	public void application_launch() {
getBrowser("chrome");getUrl("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
driver.manage().window().maximize();driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));}

	@Given("Login using {string} and {string}")
	public void login_using_and(String string, String string2) {
inputElements(op.getLaunchLogin().getUserName(), string);inputElements(op.getLaunchLogin().
getPassWord(),string2);}

	@When("Click login button")
	public void click_login_button() {
click(op.getLaunchLogin().getLoginBtn());}

	@When("Navigates to OrangeHrm homepage")
	public void navigates_to_orange_hrm_homepage() {
getThisUrl("Current URL:");	}

	@Then("Validate OrangeHrm Homepage")
	public void validate_orange_hrm_homepage() {
getTitle("Title:");	}

	@When("Mouse-hover on Recruitment Functionality")
	public void mouse_hover_on_recruitment_functionality() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Recruitment features displays")
	public void recruitment_features_displays() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Clicks on Candidates feature")
	public void clicks_on_candidates_feature() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on Recruitment Functionality")
	public void clicks_on_recruitment_functionality() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Candidates feature page gets displayed")
	public void candidates_feature_page_gets_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate Candidate feature page")
	public void validate_candidate_feature_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on First Name\"<firstname>\"field and enters valid {string}")
	public void clicks_on_first_name_firstname_field_and_enters_valid(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on Middle Name\"<middlename>\"field and enters valid {string}")
	public void clicks_on_middle_name_middlename_field_and_enters_valid(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on Last Name\"<lastname>\"field and enters valid {string}")
	public void clicks_on_last_name_lastname_field_and_enters_valid(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate Fullname field is entered with Valid {string}{string}{string}")
	public void validate_fullname_field_is_entered_with_valid(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Fullname fields are not entered with <firstname><middlename><lastname>")
	public void fullname_fields_are_not_entered_with_firstname_middlename_lastname() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate the popup error message displays under <firstname> and <lastname> fields")
	public void validate_the_popup_error_message_displays_under_firstname_and_lastname_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on Email field")
	public void clicks_on_email_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enters email field with Valid {string}")
	public void enters_email_field_with_valid(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate Valid {string} in the email field")
	public void validate_valid_in_the_email_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enters email field with <emailid> without {string} symbol")
	public void enters_email_field_with_emailid_without_symbol(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate the popup error message displays under <emailid> field")
	public void validate_the_popup_error_message_displays_under_emailid_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Email field is not entered with <emailid>")
	public void email_field_is_not_entered_with_emailid() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enters email field with <emailid>  without domain")
	public void enters_email_field_with_emailid_without_domain() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enters email field with <emailid> without . symbol")
	public void enters_email_field_with_emailid_without_symbol() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enters email field with <emailid>  with Numeric domain")
	public void enters_email_field_with_emailid_with_numeric_domain() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on Contact No field")
	public void clicks_on_contact_no_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("enters valid <contactno>")
	public void enters_valid_contactno() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate Contact No field is entered with Valid <contactno>")
	public void validate_contact_no_field_is_entered_with_valid_contactno() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("enters alphabets as <contactno>")
	public void enters_alphabets_as_contactno() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate the popup error message displays under <contactno> field")
	public void validate_the_popup_error_message_displays_under_contactno_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("enters more than {int} digit numbers as <contactno>")
	public void enters_more_than_digit_numbers_as_contactno(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on Job Vacancy drop-down field")
	public void clicks_on_job_vacancy_drop_down_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("select job position from the drop-down list")
	public void select_job_position_from_the_drop_down_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate Job Vacany field is selected")
	public void validate_job_vacany_field_is_selected() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("selects more than one job position from the drop-down list")
	public void selects_more_than_one_job_position_from_the_drop_down_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate is the Job Vacancy field is enabled to choose more than one job position")
	public void validate_is_the_job_vacancy_field_is_enabled_to_choose_more_than_one_job_position() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on Keywords field")
	public void clicks_on_keywords_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("enters keywords")
	public void enters_keywords() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate keywords written in the Keywords field")
	public void validate_keywords_written_in_the_keywords_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("enters keywords more than {int} words")
	public void enters_keywords_more_than_words(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate the popup error message displays under Keywords field")
	public void validate_the_popup_error_message_displays_under_keywords_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on Comment field")
	public void clicks_on_comment_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("enters comments")
	public void enters_comments() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate comments written in the Comment field")
	public void validate_comments_written_in_the_comment_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("enters comments more than {int} words")
	public void enters_comments_more_than_words(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate the popup error message displays under Comment field")
	public void validate_the_popup_error_message_displays_under_comment_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on Date of Application field")
	public void clicks_on_date_of_application_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("selects <date> <month> and <year> from the calender icon")
	public void selects_date_month_and_year_from_the_calender_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate <date><month><year> in the Date of Application field")
	public void validate_date_month_year_in_the_date_of_application_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("selects invalid <date> <month> and <year> from the calender icon")
	public void selects_invalid_date_month_and_year_from_the_calender_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate the popup error message displays under Date of Application field")
	public void validate_the_popup_error_message_displays_under_date_of_application_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("selects current <date> <month> and <year> from the calender icon")
	public void selects_current_date_month_and_year_from_the_calender_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on Consent to keep data radio box")
	public void clicks_on_consent_to_keep_data_radio_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate radio box selected in the Consent to keep data")
	public void validate_radio_box_selected_in_the_consent_to_keep_data() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on Save button")
	public void clicks_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate datas are saved")
	public void validate_datas_are_saved() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Add three candidates through Add feature")
	public void add_three_candidates_through_add_feature() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate added candidates")
	public void validate_added_candidates() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Two candidates are selected through tick box")
	public void two_candidates_are_selected_through_tick_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate delete feature")
	public void validate_delete_feature() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on the Sorting order feature")
	public void clicks_on_the_sorting_order_feature() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate ascending and descending order")
	public void validate_ascending_and_descending_order() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
