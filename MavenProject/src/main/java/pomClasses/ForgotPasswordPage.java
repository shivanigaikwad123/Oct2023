package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
//facebook application
	
	//variable : Webelement : login or sign up  page
	
		@FindBy(xpath="//*[@id=\\\"u_0_2_xD\\\"]/div[3]/a")
		private WebElement forgotMessage;
		
		@FindBy(xpath="//input[@name='email']")
		private WebElement emailOrMobile;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement search;
		
		@FindBy(xpath="(//a[@role='button'])[1]ath ")
		private WebElement cancel;
		
		
		
	    //constructor :initialization  of WebElement:Login or sign up page
		
		public ForgotPasswordPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		//Methods : Action on webelement :login or sign up page
		public void getforgotWindowMessage() {
			String text  =forgotMessage.getText();
			System.out.println(text);
			
		}
		
		
		public void sendPassword() {
			emailOrMobile.sendKeys("13231345523"); //mouse action
		}
		public void clickOnCancel() {
			cancel.click();
		}
		public void clickOnSearchButton() {
			search.click();
		}
}
