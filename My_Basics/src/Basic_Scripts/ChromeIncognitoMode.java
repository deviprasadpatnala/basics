package Basic_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeIncognitoMode {
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		System.setProperty("webdriver.chrome.driver", "G://Softwares//ECLIPSE//chrome driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://uk.firstbaseit.net/willis/login");
	}

}
