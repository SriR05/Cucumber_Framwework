package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_Delete_SortOrder {
	public static WebDriver driver;
	@FindBy(id="ohrmList_chkSelectRecord_24_1")
	private WebElement selectBox;
	@FindBy(id="btnDelete")
	private WebElement deleteBtn;
	public WebElement getSelectBox() {
		return selectBox;
	}
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	public WebElement getSortOrder() {
		return sortOrder;
	}
	@FindBy(linkText="Hiring Manager")
	private WebElement sortOrder;
	public Orange_Delete_SortOrder(WebDriver driver5) {
		this.driver = driver5;
		PageFactory.initElements(driver5, this);
}
}