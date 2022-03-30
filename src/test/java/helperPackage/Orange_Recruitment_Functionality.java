package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_Recruitment_Functionality {
	public static WebDriver driver;
	@FindBy(xpath="//a//b[contains(text(),'Recruitment')]")
	private WebElement rectFeat;
	public WebElement getRectFeat() {
		return rectFeat;
	}
	public Orange_Recruitment_Functionality(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

}
}
