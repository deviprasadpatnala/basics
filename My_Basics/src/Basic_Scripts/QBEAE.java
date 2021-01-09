package Basic_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QBEAE {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "G://Softwares//ECLIPSE//chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://asia.firstbaseit.net/qbeae/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.close();

	}

}
