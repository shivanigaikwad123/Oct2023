package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.ForgotPasswordPage;
import pomClasses.LoginOrSignUpPage;

public class TestClassFacebook {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\selenium new\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		
		driverTest.get("https://www.facebook.com/");
		
		LoginOrSignUpPage loginOrSignUpPage= new LoginOrSignUpPage(driverTest);
		
		loginOrSignUpPage.sendEmailOrPhoneNo();
		loginOrSignUpPage.sendPassword();
		loginOrSignUpPage.clickOnLoginButton();
		loginOrSignUpPage.clickOnLoginButton();
		
		ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driverTest);
		
		forgotPasswordPage.sendPassword();
		forgotPasswordPage.clickOnSearchButton();
		
	}

}
