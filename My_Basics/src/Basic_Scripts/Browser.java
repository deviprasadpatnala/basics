package Basic_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "G://Softwares//ECLIPSE//chrome driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	}

}