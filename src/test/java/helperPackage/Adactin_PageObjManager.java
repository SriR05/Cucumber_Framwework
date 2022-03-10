package helperPackage;

import org.openqa.selenium.WebDriver;

public class Adactin_PageObjManager {
	
	public static WebDriver driver;
	
	private Adactin_Pom_1 Login;
	public Adactin_Pom_1 getLogin() {
		Login = new Adactin_Pom_1(driver);
		return Login;
	}

	public Adactin_Pom_2 getSearch() {
		Search = new Adactin_Pom_2(driver);
		return Search;
	}

	public Adactin_Pom_3 getSelect() {
		Select = new Adactin_Pom_3(driver);
		return Select;
	}

	public Adactin_Pom_4 getBook() {
		Book = new Adactin_Pom_4(driver);
		return Book;
	}

	public Adactin_Pom5 getLogout() {
		Logout = new Adactin_Pom5(driver);
		return Logout;
	}

	private Adactin_Pom_2 Search;
	private Adactin_Pom_3 Select;
	private Adactin_Pom_4 Book;
	private Adactin_Pom5 Logout;
	
	public Adactin_PageObjManager(WebDriver driver2) {
		this.driver=driver2;
	}
	

}
