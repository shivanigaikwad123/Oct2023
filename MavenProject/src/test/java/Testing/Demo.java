package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
	//	System.out.println("shivani");
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium new\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	}

}
