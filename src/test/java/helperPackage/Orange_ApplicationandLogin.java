package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_ApplicationandLogin {
	public static WebDriver driver;
public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
@FindBy(xpath="//div//input[@name='txtUsername']")
private WebElement userName;
@FindBy(xpath="//div//input/following::span[contains(text(),'Password')][2]")
private WebElement passWord;
@FindBy(xpath="//div//*[@id='btnLogin']")
private WebElement loginBtn;

public Orange_ApplicationandLogin(WebDriver driver1) {
	this.driver = driver1;
	PageFactory.initElements(driver1, this);
}


}
