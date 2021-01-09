package Envoy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmpStartDateClear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G://Softwares//ECLIPSE//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://app.envoyglobal.com/client/auth/login");
		
		driver.findElement(By.xpath("//input[@id = 'mat-input-0']")).sendKeys("service_rpa_prd@envoyglobal.com");
		driver.findElement(By.xpath("//input[@id = 'mat-input-1']")).sendKeys("PleaseBeSafe123");
		driver.findElement(By.xpath("//button[@class = 'mat-focus-indicator w-100 ng-tns-c400-0 mat-flat-button mat-button-base mat-primary']")).click();
		
		
	    driver.findElement(By.xpath("//input[@class = 'form-control ng-untouched ng-pristine ng-valid']")).sendKeys("Prasad");
	    
		/*
		List<WebElement> olist = driver.findElements(By.tagName("a"));
		System.out.println(olist.size());
		
		for(int i=0; i<olist.size(); i++) {
			olist.get(i).click();
			**/
		//driver.get("https://app.envoyglobal.com/client/E2-611950/dashboard/3f28c900-73f6-48fa-a255-2ed4b5f3f518/overview");
		
		//driver.findElement(By.xpath("//input[@class = 'form-control ng-tns-c481-18 ng-valid ng-touched ng-dirty']")).sendKeys("John  FORDHAM");
		//driver.findElement(By.xpath("//a[@class = 'ng-tns-c481-18']")).click();
		
		
	    }
	
	
		}
		
	



