package Basic_Scripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

		public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G://Softwares//ECLIPSE//chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://uk.firstbaseit.net/willis/login");
		driver.manage().window().maximize();
		TakesScreenshot shot = (TakesScreenshot)driver;
		File source = shot.getScreenshotAs(OutputType.FILE);	
		FileUtils.copyFile(source, new File("G:\\Softwares\\ECLIPSE\\Screenshots\\image.png"));
		System.out.println("screenshot taken");
		
		
	}

}
