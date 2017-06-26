package by.htp.seleniumQuzful;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {
    
	private static WebDriver driver;
		
	@BeforeClass
	public static void initBrowser(){
		System.setProperty("webdriver.gecko.driver","C://Program Files//geckodriver-v0.17.0-win64//geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void quzfulSiteRegistrationTest() {
		driver.get("http://www.quizful.net/test");
		WebElement searchElement=driver.findElement(By.xpath(".//a[@href='/LoginAction.registration']"));
		searchElement.click();
		WebElement searchElementLogin=driver.findElement(By.id("login"));
		searchElementLogin.sendKeys("artushevskaya");
		WebElement searchElementPassword=driver.findElement(By.xpath(".//input[@name='registrationForm.password']"));
		searchElementPassword.sendKeys("123olya");
		WebElement searchElementRePassword=driver.findElement(By.xpath(".//input[@name='registrationForm.repassword']"));
		searchElementRePassword.sendKeys("123olya");
		WebElement searchElementEmail=driver.findElement(By.xpath(".//input[@name='registrationForm.email']"));
		searchElementEmail.sendKeys("bymbara4a@rambler.ru");
		WebElement searchElementCorporate=driver.findElement(By.id("corporate"));
		searchElementCorporate.click();
		
		//WebElement searchElementCaptcha=driver.findElement(By.xpath(".//input[@name='registrationForm.captcha']"));
		
		try {
			Thread.sleep(30000L);  //timeout для заполнения капча вручную
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		WebElement searchElementButton=driver.findElement(By.xpath(".//input[@class='btn btn-primary']"));
		searchElementButton.click();
				
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}
}
