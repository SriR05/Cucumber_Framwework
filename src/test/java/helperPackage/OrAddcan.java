package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrAddcan {
	public static WebDriver driver;
	@FindBy(id="btnAdd")
	private WebElement addBtn;
	@FindBy(xpath="//*//input[contains(@id,'firstName')]")
	private WebElement firstName;
	@FindBy(xpath="//*//input[contains(@id,'middleName')]")
	private WebElement middleName;
	@FindBy(xpath="//*//input[contains(@id,'lastName')]")
	private WebElement lastName;
	@FindBy(xpath="//input[@name='addCandidate[email]']")
	private WebElement emailID;
	@FindBy(id="addCandidate_contactNo")
	private WebElement contactNo;
	@FindBy(className="vacancyDrp")
	private WebElement jobVacancy;
	@FindBy(xpath="//*//input[contains(@id,'keyWords')]")
	private WebElement keyWords;
	@FindBy(id="addCandidate_comment")
	private WebElement commenBox;
	@FindBy(xpath="//input[@id='addCandidate_appliedDate']")
	private WebElement dOA;
	@FindBy(xpath="//input[starts-with(@id,'addCandidate_conse')]")
	private WebElement consentBox;
	@FindBy(id="btnSave")
	private WebElement saveBtn;
	@FindBy(id="btnBack")
	private WebElement backBtn;
	public OrAddcan(WebDriver driver3) {
		OrAddcan.driver = driver3;
		PageFactory.initElements(driver3, this);

}
	public WebElement getAddBtn() {
		return addBtn;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getMiddleName() {
		return middleName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getEmailID() {
		return emailID;
	}
	public WebElement getContactNo() {
		return contactNo;
	}
	public WebElement getJobVacancy() {
		return jobVacancy;
	}
	public WebElement getKeyWords() {
		return keyWords;
	}
	public WebElement getCommenBox() {
		return commenBox;
	}
	public WebElement getdOA() {
		return dOA;
	}
	public WebElement getConsentBox() {
		return consentBox;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getBackBtn() {
		return backBtn;
	}
}