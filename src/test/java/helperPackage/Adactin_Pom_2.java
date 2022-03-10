  package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Pom_2 {
	
	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement hotelLoc;
	public WebElement getHotelLoc() {
		return hotelLoc;
	}



	public WebElement getnHotel() {
		return nHotel;
	}



	public WebElement getRtype() {
		return Rtype;
	}



	public WebElement getChIn() {
		return chIn;
	}



	public WebElement getChOut() {
		return chOut;
	}



	public WebElement getaRoom() {
		return aRoom;
	}



	public WebElement getcRoom() {
		return cRoom;
	}



	public WebElement getSubBtn() {
		return subBtn;
	}



	@FindBy(id="hotels")
	private WebElement nHotel;
	@FindBy(id="room_type")
	private WebElement Rtype;
	@FindBy(id="datepick_in")
	private WebElement chIn;
	@FindBy(id="datepick_out")
	private WebElement chOut;
	@FindBy(id="adult_room")
	private WebElement aRoom;
	@FindBy(id="child_room")
	private WebElement cRoom;
	@FindBy(id="Submit")
	private WebElement subBtn;
	@FindBy(id="room_nos")
	private WebElement rNo;
	
	
	
	public WebElement getrNo() {
		return rNo;
	}



	public Adactin_Pom_2(WebDriver driver2) {
		this.driver	 = driver2;
		PageFactory.initElements(driver2,this);
		
	}
	
		
		

}
