package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrDelSort {
	public static WebDriver driver;
	@FindBy(id="btnDelete")
	private WebElement delBtn;
	@FindBy(linkText="Hiring Manager")
	private WebElement sortOrder;
	public OrDelSort(WebDriver driver3) {
		OrDelSort.driver = driver3;
		PageFactory.initElements(driver3, this);
	}
	public WebElement getDelBtn() {
		return delBtn;
	}
	public WebElement getSortOrder() {
		return sortOrder;
	}

}
