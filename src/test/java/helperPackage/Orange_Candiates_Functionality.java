package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_Candiates_Functionality {
	public static WebDriver driver;
	@FindBy(id="btnAdd")
	private WebElement addFeat;
	public WebElement getAddFeat() {
		return addFeat;
	}
	public Orange_Candiates_Functionality(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver3, this);

}
}
