package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Pom_3 {

	public static WebDriver driver;
	
	public WebElement getRadBtn() {
		return radBtn;
	}


	public WebElement getMoveFrd() {
		return moveFrd;
	}


	@FindBy(id="radiobutton_0")
	private WebElement radBtn;
	@FindBy(id="continue")
	private WebElement moveFrd;
	
	
	public Adactin_Pom_3(WebDriver driver3){
	this.driver	 = driver3;
	PageFactory.initElements(driver3,this);
	
	}

	
	
}
