package by.htp.seleniumTutByExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
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
	public void tutByMainNewsTest(){
		driver.get("http://www.tut.by");
		WebElement searchElement=driver.findElement(By.xpath(".//span[@class='header _title']"));
		searchElement.click();
		int count = driver.findElements(By.xpath(".//div[@id='article_body']/p")).size();
		System.out.println("Number of paragraphs in the article: "+count);	
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}
	
}

