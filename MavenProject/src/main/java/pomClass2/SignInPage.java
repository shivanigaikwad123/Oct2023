package pomClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	@FindBy(xpath="//input[@name='customerName']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement mobilenumber;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebutton;

	 //constructor :initialization  of WebElement:Login or sign up page
	
		public SignInPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		//Methods : Action on webelement :login or sign up page

			public void sendusername() {
				username.sendKeys("sdfdlkhd");
			}
				
				public void sendmobilenumber() {
					mobilenumber.sendKeys("943684578");
				}
				
				public void sendpassword () {
					password.sendKeys();
					
				}
				

				public void clickOncontinuebutton () {
					continuebutton.sendKeys();
					
				}
		
}
