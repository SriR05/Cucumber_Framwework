package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Orange_PageObjManager {

	public static WebDriver driver;
	
	private Orange_ApplicationandLogin launchLogin;
	public Orange_ApplicationandLogin getLaunchLogin() {
		return launchLogin;
	}

	public Orange_Recruitment_Functionality getRectFunct() {
		return rectFunct;
	}

	public Orange_Candiates_Functionality getCandFunct() {
		return candFunct;
	}

	public Orange_Add_Candidate getAddCand() {
		return addCand;
	}

	public Orange_Delete_SortOrder getDelOrd() {
		return delOrd;
	}

	private Orange_Recruitment_Functionality rectFunct;
	private Orange_Candiates_Functionality candFunct;
	private Orange_Add_Candidate addCand;
	private Orange_Delete_SortOrder delOrd;
	
	public Orange_PageObjManager(WebDriver driver6) {
	this.driver=driver6;
	PageFactory.initElements(driver6, this);
	}

	}
