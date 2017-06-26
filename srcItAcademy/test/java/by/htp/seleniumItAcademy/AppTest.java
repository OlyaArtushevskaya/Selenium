package by.htp.seleniumItAcademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
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
	public void menuItAcademyTest() {
		driver.get("http://www.it-academy.by/");
		
		WebElement searchElementStudy=driver.findElement(By.xpath(".//a[@href='/study']"));
		System.out.println("Drop-down menu");
		System.out.println("--------------");
		System.out.println(searchElementStudy.getText());
		
		Actions a = new Actions(driver);
		
		a.moveToElement(searchElementStudy).build().perform();
				
		WebElement searchElementStudyProf=driver.findElement(By.xpath(".//a[@href='/study/proforientaciya']"));
		System.out.println("  * "+searchElementStudyProf.getText());
		
		WebElement searchElementStudyCareer=driver.findElement(By.xpath(".//a[@href='/study/career']"));
		System.out.println("  * "+searchElementStudyCareer.getText());
		
		a.moveToElement(searchElementStudyCareer).build().perform();
		
		WebElement searchElementStudyCareerJavaProgrammer=driver.findElement(By.xpath(".//a[@href='/study/career/java-programmer']"));
		System.out.println("     ** "+searchElementStudyCareerJavaProgrammer.getText());
		
		WebElement searchElementStudyCareerBussinesAnalytic=driver.findElement(By.xpath(".//a[@href='/study/career/bussines-analytic']"));
		System.out.println("     ** "+searchElementStudyCareerBussinesAnalytic.getText());
		
		WebElement searchElementStudyCareerProgrammer=driver.findElement(By.xpath(".//a[@href='/study/career/programmer']"));
		System.out.println("     ** "+searchElementStudyCareerProgrammer.getText());
		
		WebElement searchElementStudyCareerTester=driver.findElement(By.xpath(".//a[@href='/study/career/tester']"));
		System.out.println("     ** "+searchElementStudyCareerTester.getText());
		
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}
}
