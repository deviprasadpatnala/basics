package Basic_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G://Softwares//ECLIPSE//chromedriver_win32/chromedriver.exe");
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://uk.firstbaseit.net/willis/login");
		driver.manage().window().maximize();
		Thread.sleep(100);

		driver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("qbeadmin");
		driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("Password2");
		Thread.sleep(100);
		
		
		driver.findElement(By.xpath("//button[@name='go']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		}
		
			}


