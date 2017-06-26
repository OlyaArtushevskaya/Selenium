package by.htp.seleniumQuzfulProfileSetup;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
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
	public void profileSetupTest() {
		driver.get("http://www.quizful.net/test");
		
		WebElement searchElementLoginForm=driver.findElement(By.xpath(".//a[@href='/LoginAction.loginForm']"));
		searchElementLoginForm.click();
				
		WebElement searchElementLogin=driver.findElement(By.id("login"));
		searchElementLogin.sendKeys("olyaart");
		
		WebElement searchElementPassword=driver.findElement(By.xpath(".//input[@name='loginForm.password']"));
		searchElementPassword.sendKeys("912artushevskaya");
		
		WebElement searchElementEnterButton=driver.findElement(By.xpath(".//input[@class='btn btn-primary']"));
		searchElementEnterButton.click();
		
		WebElement searchElementProfile=driver.findElement(By.xpath(".//ul[@id='user-panel']/li/b/a"));
		searchElementProfile.click();
		
		WebElement searchElementEditButton1=driver.findElement(By.xpath(".//a[@class='btn btn-default btn-xs']"));
		searchElementEditButton1.click();                                            
		
		WebElement searchElementPersonalForm=driver.findElement(By.xpath(".//div[@id='profile-personal-form']/div[@class='title']"));
		searchElementPersonalForm.click();
		
		WebElement searchElementPersonalFormName=driver.findElement(By.xpath(".//input[@name='personalForm.name']"));
		searchElementPersonalFormName.sendKeys("Olya");
		
		WebElement searchElementPersonalFormSurname=driver.findElement(By.xpath(".//input[@name='personalForm.surname']"));
		searchElementPersonalFormSurname.sendKeys("Artushevskaya");
		
		WebElement searchElementPersonalFormBirthyear=driver.findElement(By.xpath(".//input[@name='personalForm.birthyear']"));
		searchElementPersonalFormBirthyear.sendKeys("1987");
		
		WebElement searchElementPersonalFormSite=driver.findElement(By.xpath(".//input[@name='personalForm.site']"));
		searchElementPersonalFormSite.sendKeys("--");
		
		WebElement searchElementPersonalFormCompany=driver.findElement(By.xpath(".//input[@name='personalForm.company']"));
		searchElementPersonalFormCompany.sendKeys("--");
		
		WebElement searchElementPersonalFormCountry=driver.findElement(By.xpath(".//select[@name='personalForm.countryId']"));
		Select selectCountry=new Select(searchElementPersonalFormCountry);
	    selectCountry.selectByValue("XisgEe4sJp28");
	    
	    WebElement searchElementPersonalFormCity=driver.findElement(By.xpath(".//select[@name='personalForm.cityId']"));
		Select selectCity=new Select(searchElementPersonalFormCity);
	    selectCity.selectByValue("add");
	    
	    WebElement searchElementPersonalFormAddCity=driver.findElement(By.xpath(".//input[@name='personalForm.cityName']"));
		searchElementPersonalFormAddCity.sendKeys("Бобруйск");
		
		WebElement searchElementPersonalFormZone=driver.findElement(By.xpath(".//select[@name='personalForm.zone']"));
		Select selectZone=new Select(searchElementPersonalFormZone);
	    selectZone.selectByValue("Europe/Minsk");
	    
	    WebElement searchElementPersonalFormAbout=driver.findElement(By.xpath(".//textarea[@name='personalForm.about']"));
		searchElementPersonalFormAbout.sendKeys("--");
		
		File file = new File("D://Оля//485959435.jpeg");
		
		WebElement searchElementPersonalFormAvatar=driver.findElement(By.xpath(".//input[@name='personalForm.avatar']"));
		searchElementPersonalFormAvatar.sendKeys(file.getAbsolutePath());
		
		WebElement searchElementSaveButtonPersonalForm=driver.findElement(By.xpath(".//input[@name='personalForm.save']"));
		searchElementSaveButtonPersonalForm.click();
		
		WebElement searchElementEditButton2=driver.findElement(By.xpath(".//a[@class='btn btn-default btn-xs']"));
		searchElementEditButton2.click();  
		
		WebElement searchElementNotificationsForm=driver.findElement(By.xpath(".//div[@id='profile-notifications-form']/div[@class='title']"));
		searchElementNotificationsForm.click();
		
		WebElement searchElementNotificationsEnabled=driver.findElement(By.xpath(".//input[@name='notificationsForm.notificationsEnabled']"));
		searchElementNotificationsEnabled.click();
		
		WebElement searchElementDeliveryEnabled=driver.findElement(By.xpath(".//input[@name='notificationsForm.deliveryEnabled']"));
		searchElementDeliveryEnabled.click();
		
		WebElement searchElementSaveButtonNotificationsForm=driver.findElement(By.xpath(".//input[@name='notificationsForm.save']"));
		searchElementSaveButtonNotificationsForm.click();
		
		WebElement searchElementEditButton3=driver.findElement(By.xpath(".//a[@class='btn btn-default btn-xs']"));
		searchElementEditButton3.click();
		
		WebElement searchElementPrivacyForm=driver.findElement(By.xpath(".//div[@id='profile-privacy-form']/div[@class='title']"));
		searchElementPrivacyForm.click();
		
		WebElement searchElementProfileVisibility=driver.findElement(By.xpath(".//input[@value='closed']"));
		searchElementProfileVisibility.click();
		
		WebElement searchElementTestrunsVisibility=driver.findElement(By.xpath(".//input[@value='all']"));
		searchElementTestrunsVisibility.click();	
		
		WebElement searchElementSaveButtonPrivacyForm=driver.findElement(By.xpath(".//input[@name='privacyForm.save']"));
		searchElementSaveButtonPrivacyForm.click();
				
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}
}
