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
	public void clickOnShoppingLing() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
	}
	@Test(priority=11)
	public void clickOnBluetoothEarphone() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='prodrelquries']//following-sibling::a[5]")).click();
	}
	@Test(priority=12)
	public void clickOnSports_ShoesLing() {
		driver.findElement(By.xpath("//span[@id='username']//preceding::a[@class='shopicon relative']")).click();
		driver.findElement(By.xpath("//div[@class='relquries grey']//following-sibling::a[5]")).click();
	}

	@Test(priority=13)
	public void clickOnNewsLink() {
		driver.findElement(By.xpath("//body/div[5]/ul[1]/li[2]/a[1]")).click();
	}
	
@AfterMethod
public void aftermethod() {
driver.quit();
}

}
