package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Pom_1 {

	public static WebDriver driver;
	
	@FindBy(id="username")
	private WebElement UsrN;
	public WebElement getUsrN() {
		return UsrN;
	}

	public WebElement getPsW() {
		return PsW;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id="password")
	private WebElement PsW;
	@FindBy(id="login")
	private WebElement login;
	
	public Adactin_Pom_1(WebDriver driver1) {
	Adactin_Pom_1.driver	 = driver1;
	PageFactory.initElements(driver1,this);
	
	
	}	
	
}
