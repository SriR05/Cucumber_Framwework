package helperPackage;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrLoginPage {
	public static WebDriver driver;
	@FindBy(id="txtUsername")
	private WebElement username;
	@FindBy(id="txtPassword")
	private WebElement passWord;
	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	public OrLoginPage(WebDriver driver1) {
		OrLoginPage.driver = driver1;
		PageFactory.initElements(driver1,this);
		


}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
}