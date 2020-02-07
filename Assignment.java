import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ScrollsTo;

public class Assignment {
	public static void main(String[] args) throws InterruptedException { 
	    System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\fireefox.exe" );  
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Mozilla Firefox\\fireefox.exe");  
		//WebDriver driver=new ChromeDriver();
		
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		    capabilities.setCapability("marionette",true);  
		    WebDriver driver= new FirefoxDriver(capabilities);  
		
	    
		driver.navigate().to("http://www.google.com/"); 
		driver.findElement(By.id("lst-ib")).sendKeys(" https://www.tripadvisor.in/"); 
		driver.findElement(By.xpath("input[@text='Sign up'])")).click();
		TimeUnit.SECONDS.sleep(4);
		if( driver.findElement(By.id("recaptcha-anchor-label")).isDisplayed()){
			driver.findElement(By.id("recaptcha-anchor-label")).click();
			TimeUnit.SECONDS.sleep(2);
		}
		driver.findElement(By.xpath("input[@text='Continue with Google '])")).click();
		TimeUnit.SECONDS.sleep(4);
		driver.findElement(By.id("profileIdentifier")).click();
		TimeUnit.SECONDS.sleep(4);
		driver.findElement(By.className("brand-global-nav-action-search-Search__label--3PRUD")).click();
		driver.findElement(By.id("mainSearch")).sendKeys("Club Mahindra");
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.className("result-title")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.className("ui_bubble_rating bubble_45")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("input[@text='Write a review'])")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("ui_bubble_rating fl bubble_50[@data-value='5']")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("ReviewTitle")).sendKeys("Looking good");
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("ReviewText")).sendKeys("The location the only one downfall was they did not have a courtesy room they had a baggage room and was happy for you to use the hotel facilities and shower on rooftop but not ideal if the weather was bad but otherwise was fab");
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.className("c-cell jfy_cloud tag content category-Business")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.className("c-cell jfy_cloud tag content category-Business")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("trip_date_month_year")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("DATE_OF_VISIT")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("noFraud")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("SUBMIT")).click();



	}
}