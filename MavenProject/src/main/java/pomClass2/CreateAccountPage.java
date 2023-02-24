package pomClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	// Amazon Application
	
	@FindBy(xpath="//*[@id=\\\"nav-link-accountList\\\"]/span")
	private WebElement emailOrMobilenumber;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebutton;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement createyourAmazonaccount;

	
	
	
	 //constructor :initialization  of WebElement:Login or sign up page
	
	public CreateAccountPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//Methods : Action on webelement :login or sign up page

		public void sendemailOrMobilenumber() {
			emailOrMobilenumber.sendKeys("sdfdlkhd");
		}
			
			public void clickOncontinueButton() {
				continuebutton.click();
			}
			
			public void clickOncreateyourAmazonaccount() {
				createyourAmazonaccount.click();
				
			}
	
	
	
	
	
}


