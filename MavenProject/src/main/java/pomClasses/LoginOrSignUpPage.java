package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
//facebook application
	
	//variable : Webeelement : login or sign up  page
	
	@FindBy(xpath=" //input[@id='email']")
	private WebElement emailOrPhoneNo;
	
	//@FindBy(xpath="//input[@id='pass']")
	//private WebElement password;
	
	@FindBy(xpath="//input[@id='pass1234556']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginButton;
	
	@FindBy(xpath="//*[@id=\"u_0_2_xD\"]/div[3]/a")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement creatNewAccountButton;
	
    //constructor :initialization  of WebElement:Login or sign up page
	
	public LoginOrSignUpPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//Methods : Action on webelement :login or sign up page
	public void sendEmailOrPhoneNo() {
		emailOrPhoneNo.sendKeys("sdfdlkhd");
	}
	
	
	public void sendPassword() {
		password.sendKeys("132323");
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public void openSignUpForm() {
		creatNewAccountButton.click();
	}
	
}
