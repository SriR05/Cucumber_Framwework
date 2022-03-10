package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Pom5 {
	public static WebDriver driver;
	
	@FindBy(id="logout")
	private WebElement outBtn;
	public WebElement getOutBtn() {
		return outBtn;
	}

	public WebElement getClickBtn() {
		return clickBtn;
	}

	@FindBy(linkText ="Click here to login again")
	private WebElement clickBtn;
	
	public Adactin_Pom5(WebDriver driver5) {
	this.driver	 = driver5;
	PageFactory.initElements(driver5,this);
	
	
	}	
	

}
