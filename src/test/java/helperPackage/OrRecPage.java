package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrRecPage {
	public static WebDriver driver;
	@FindBy(xpath="//a//b[contains(text(),'Recruitment')]")
	private WebElement rectFeat;
	public OrRecPage(WebDriver driver2) {
		OrRecPage.driver = driver2;
		PageFactory.initElements(driver2, this);}
	public WebElement getRectFeat() {
		return rectFeat;}}
