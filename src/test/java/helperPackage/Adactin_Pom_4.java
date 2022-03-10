package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Pom_4 {
	
public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement fName;
	public WebElement getfName() {
		return fName;
	}


	public WebElement getlName() {
		return lName;
	}


	public WebElement getAddressDetail() {
		return addressDetail;
	}


	public WebElement getCardNo() {
		return cardNo;
	}


	public WebElement getCardType() {
		return cardType;
	}


	public WebElement getExpMon() {
		return expMon;
	}


	public WebElement getExpYr() {
		return expYr;
	}


	public WebElement getCvvNo() {
		return cvvNo;
	}


	public WebElement getNowBtn() {
		return nowBtn;
	}


	@FindBy(id="last_name")
	private WebElement lName;
	@FindBy(id="address")
	private WebElement addressDetail;
	@FindBy(id="cc_num")
	private WebElement cardNo;
	@FindBy(id="cc_type")
	private WebElement cardType;
	@FindBy(id="cc_exp_month")
	private WebElement expMon;
	@FindBy(id="cc_exp_year")
	private WebElement expYr;
	@FindBy(id="cc_cvv")
	private WebElement cvvNo;
	@FindBy(id="book_now")
	private WebElement nowBtn;
	public WebElement getScreenShot1() {
		return screenShot1;
	}


	@FindBy(id="my_itinerary")
	private WebElement screenShot1;
	
	
	
	public Adactin_Pom_4(WebDriver driver4) {
		this.driver	 = driver4;
		PageFactory.initElements(driver4,this);
		
	}
	
		
		


}
