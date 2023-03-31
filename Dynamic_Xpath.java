package advanced_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dynamic_Xpath {
	public static ChromeOptions options;

public static WebDriver driver;

@BeforeMethod
public void setUp() {
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://www.rediff.com/");
}
	@Test(priority=1)
	public void clickOnSignLink() {
		
	driver.findElement(By.xpath("//p[@id='signin_info']/child::a[@class='signin']")).click();
	driver.findElement(By.xpath("//div[@id='div_login_error']/following-sibling::div[@class='table']/descendant::div[3]/child::input[@id='login1'and @name='login']")).sendKeys("seleniumpanda@rediffmail.com");
    driver.findElement(By.xpath("//img[@id='fill_metric']/preceding::input[@id='password' and @name='passwd']")).sendKeys("Selenium@123");
	driver.findElement(By.xpath("//div[@id='div_login_error']/following-sibling::div[@class='table']/descendant::input[@class='signinbtn']")).click();
	driver.findElement(By.xpath("//div[@class='rd_header']/descendant::a[contains(text(),'Logout')]")).click();

}
	@Test(priority=2)
	public void clickOnRediffmail() {
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[1]")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@id='div_login_error']/following-sibling::div[@class='table']/descendant::input[@class='signinbtn']")).click();
	}
	@Test(priority=3)
	public void clickOnMoneyLink() {
		driver.findElement(By.xpath("//a[@class='mailicon']//following-sibling::a[1]")).click();
	}
	@Test(priority=4)
	public void clickOnBusinessEmailLink() {
		driver.findElement(By.xpath("//a[@class='moneyicon relative']//following-sibling::a[1]")).click();
	}
	@Test(priority=5)
	public void clickOnVideosLink() {
		driver.findElement(By.xpath("//a[@class='bmailicon relative']//following-sibling::a[1]")).click();
	}
	@Test(priority=6)
	public void clickOnIPL_Link() {
		driver.findElement(By.xpath("//a[@class='bmailicon relative']//following-sibling::a[1]")).click();
		driver.findElement(By.xpath("//div[@id='srchque_10']//following-sibling::a[4]")).click();
	}
	@Test(priority=7)
	public void clickOnCoronavirusLink() {
		driver.findElement(By.xpath("//a[@class='bmailicon relative']//following-sibling::a[1]")).click();
		driver.findElement(By.xpath("//div[@id='srchque_10']//following-sibling::a[4]")).click();
	}
	@Test(priority=8)
	public void clickOnRecipesLink() {
		driver.findElement(By.xpath("//a[@class='bmailicon relative']//following-sibling::a[1]")).click();
		driver.findElement(By.xpath("//span[@class='clear']//preceding::div[@id='srchque_10']//following-sibling::a[4]")).click();
	}
	@Test(priority=9)
	public void clickOnMoviesLink() {
		driver.findElement(By.xpath("//a[@class='bmailicon relative']//following-sibling::a[1]")).click();
		driver.findElement(By.xpath("//span[@class='clear']//preceding::div[@id='srchque_10']//following-sibling::a[3]")).click();
	}
	@Test(priority=10)
	public void clickOnShoppingLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
	}
	@Test(priority=11)
	public void clickOnBluetoothEarphoneLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='prodrelquries']//following-sibling::a[5]")).click();
	}
	@Test(priority=12)
	public void clickOnSports_ShoesLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@class='relquries grey']//following-sibling::a[5]")).click();
	}

	@Test(priority=13)
	public void clickOnNewsLink() {
		driver.findElement(By.xpath("//body/div[5]/ul[1]/li[2]/a[1]")).click();
	}
	@Test(priority=14)
	public void clickOnWriteMailLink() {
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[1]")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@id='div_login_error']/following-sibling::div[@class='table']/descendant::input[@class='signinbtn']")).click();
		driver.findElement(By.xpath("//*[@id='boxscroll']/li[1]/a/b")).click();
	}
	@Test(priority=15)
	public void clickOnInboxMailLink() {
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[1]")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@id='div_login_error']/following-sibling::div[@class='table']/descendant::input[@class='signinbtn']")).click();
		driver.findElement(By.xpath("//ul[@id='boxscroll']/li[2]/a")).click();
	}
	@Test(priority=16)
	public void clickOnBulkLink() {
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[1]")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@id='div_login_error']/following-sibling::div[@class='table']/descendant::input[@class='signinbtn']")).click();
		driver.findElement(By.xpath("//ul[@id='boxscroll']/li[3]/a")).click();
	}
	@Test(priority=16)
	public void clickOnJunkLink() {
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[1]")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@id='div_login_error']/following-sibling::div[@class='table']/descendant::input[@class='signinbtn']")).click();
		driver.findElement(By.xpath("//ul[@id='boxscroll']/li[3]/a")).click();
	}
	@Test(priority=17)
	public void clickOnSentLink() {
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[1]")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@id='div_login_error']/following-sibling::div[@class='table']/descendant::input[@class='signinbtn']")).click();
		driver.findElement(By.xpath("//ul[@id='boxscroll']/li[5]/a")).click();
	}
	@Test(priority=18)
	public void clickOnTrashLink() {
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[1]")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@id='div_login_error']/following-sibling::div[@class='table']/descendant::input[@class='signinbtn']")).click();
		driver.findElement(By.xpath("//ul[@id='boxscroll']/li[6]/a")).click();
	}
	@Test(priority=19)
	public void clickOnDraftsLink() {
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[1]")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@id='div_login_error']/following-sibling::div[@class='table']/descendant::input[@class='signinbtn']")).click();
		driver.findElement(By.xpath("//ul[@id='boxscroll']/li[7]/a")).click();
	}
	@Test(priority=20)
	public void clickOnFoldersLink() {
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[1]")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@id='div_login_error']/following-sibling::div[@class='table']/descendant::input[@class='signinbtn']")).click();
		driver.findElement(By.xpath("//ul[@id='boxscroll']/li[8]/a/b")).click();
	}
	@Test(priority=21)
	public void clickOnAdressBookLink() {
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[1]")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@id='div_login_error']/following-sibling::div[@class='table']/descendant::input[@class='signinbtn']")).click();
		driver.findElement(By.xpath("//div[@id='mail_main_box_cont']/div[1]/div[1]/div[2]/div[1]/h4")).click();
	}
	@Test(priority=22)
	public void clickOnCalendarBookLink() {
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[1]")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@id='div_login_error']/following-sibling::div[@class='table']/descendant::input[@class='signinbtn']")).click();
		driver.findElement(By.xpath("//div[@id='mail_main_box_cont']/div[1]/div[1]/div[2]/div[2]/h4")).click();
	}
	@Test(priority=23)
	public void clickOnBagsAndLuggageLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='popular_cat']/h3[1]/a")).click();
	}
	@Test(priority=24)
	public void clickOnCameraAndOpticsLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='popular_cat']/h3[2]/a")).click();
	}
	@Test(priority=25)
	public void clickOnCarAndBikeAccessoriesLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='popular_cat']/h3[3]/a")).click();
	}
	@Test(priority=26)
	public void clickOnComputersAndITLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='popular_cat']/h3[4]/a")).click();
	}
	@Test(priority=27)
	public void clickOnFaithAndBeliefsLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id=\"popular_cat\"]/h3[5]/a")).click();
	}
	@Test(priority=28)
	public void clickOnHomeAppliancesLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='popular_cat']/h3[6]/a")).click();
	}
	@Test(priority=29)
	public void clickOnJewelleryLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='popular_cat']/h3[7]/a")).click();
	}
	@Test(priority=30)
	public void clickOnKitchenLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='popular_cat']/h3[8]/a")).click();
	}
	@Test(priority=31)
	public void clickOnOfficeProductsLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='popular_cat']/h3[9]/a")).click();
	}
	@Test(priority=32)
	public void clickOnSportsLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='popular_cat']/h3[10]/a")).click();
	}
	@Test(priority=33)
	public void clickOnToysAndGamesLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='popular_cat']/h3[11]/a")).click();
	}
	@Test(priority=34)
	public void clickOnPetSuppliesLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='popular_cat']/h3[12]/a")).click();
	}
	@Test(priority=34)
	public void clickOnBrandsLink() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='popular_cat']/h3[13]/a")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
@AfterMethod
public void aftermethod() {
driver.quit();
}

}
