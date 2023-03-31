package advanced_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CssSelector_Rediff_Link {
	
	
public static WebDriver driver;

@BeforeMethod
public void setUp() {
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
}
@Test(priority=1)
public void clickOnSigninLink() {
	
	driver.findElement(By.cssSelector("div.logobar:nth-child(4) div.table div.cell.alignR.toprlinks:nth-child(3) p:nth-child(2) > a.signin:nth-child(1)")).click();
	driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.quit();
}
@Test(priority=2)
public void createNewAccountLink() {
	 driver.findElement(By.cssSelector("div.logobar:nth-child(4) div.table div.cell.alignR.toprlinks:nth-child(3) p:nth-child(2) > a:nth-child(3)")).click();
}
@Test(priority=3)
public void clickOnRediffMailLink() {
    driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.mailicon")).click();
    driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	
}
@Test(priority=4)

	public void clickOnMoneyLink() {
	driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.moneyicon.relative")).click();

	}
@Test(priority=5)
public void clickOnBusinessEmail() throws InterruptedException {
	driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.bmailicon.relative")).click();
    driver.findElement(By.cssSelector("body:nth-child(2) div.intro_page:nth-child(2) div.container div.navbar-btn.d-sm-inline-block.login_tp_btn.nt_home:nth-child(3) > a.main-btn-1.top_login.home_login")).click();
    driver.findElement(By.cssSelector("input#username_direct")).sendKeys("seleniumpanda@rediffmail.com");
	
	driver.findElement(By.cssSelector("input#clpass_direct")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("div.account:nth-child(4) div.container div.login form:nth-child(3) ul.tb-cont.tab-content li.last:nth-child(4) > button.main-btn:nth-child(2)")).click();
}
@Test(priority=6)
public void clickOnVideosLink() {
	driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.vdicon")).click();

}
@Test(priority=7)
public void clickOnLeatestVideoLink() {
	driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.vdicon")).click();
	driver.findElement(By.cssSelector("div#srchque_10")).click();
	
	driver.findElement(By.cssSelector("div.hd-tld-wrapper:nth-child(4) div.header-wrapper:nth-child(8) div.header-content div.search-box-wrapper:nth-child(2) div.search-box-outer div.sm1.hide:nth-child(3) > a:nth-child(3)")).click();
   

}
@Test(priority=8)
public void clickOnShoppingLink() {
	driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.shopicon.relative")).click();
  
}
@Test(priority=9)
public void clickOnSignOutLink() {

	driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.mailicon")).click();
    driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.findElement(By.cssSelector("body.theme_1:nth-child(2) div.rd_wrapper.is_red_user:nth-child(5) div.rd_header div.rd_container div.setting_rd:nth-child(4) > a.rd_logout:nth-child(5)")).click();


}
@Test(priority=10)
public void clickOnRediffHomelink() {
	driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.mailicon")).click();
    driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.findElement(By.cssSelector("body.theme_1:nth-child(2) div.rd_wrapper.is_red_user:nth-child(5) div.rd_header div.rd_container div.setting_rd:nth-child(4) > a.rd_logout:nth-child(5)")).click();driver.findElement(By.cssSelector("div.header:nth-child(4) div.new_container span:nth-child(2) a:nth-child(2) > b:nth-child(1)")).click();

	driver.quit();
}
@Test(priority=11)
public void clickOnNewsLink() {
	driver.findElement(By.cssSelector("body:nth-child(2) div.navbar:nth-child(7) ul.navbarul li.news:nth-child(2) > a:nth-child(1)")).click();
}
@Test(priority=12)
public void clickOnBusinessLink() {
	driver.findElement(By.cssSelector("body:nth-child(2) div.navbar:nth-child(7) ul.navbarul li.business:nth-child(3) > a:nth-child(1)")).click();
}

@Test(priority=13)
public void clickOnMoviesLink() {
	driver.findElement(By.cssSelector("body:nth-child(2) div.navbar:nth-child(7) ul.navbarul li.movies:nth-child(4) > a:nth-child(1)")).click();
}
@Test(priority=14)
public void clickOnCricketLink() {
	driver.findElement(By.cssSelector("body:nth-child(2) div.navbar:nth-child(7) ul.navbarul li.cricket:nth-child(5) > a:nth-child(1)")).click();
}
@Test(priority=15)
public void clickOnSportsLink() {
	driver.findElement(By.cssSelector("body:nth-child(2) div.navbar:nth-child(7) ul.navbarul li.sports:nth-child(6) > a:nth-child(1)")).click();
}
@Test(priority=16)
public void clickOnGetAheadLink() {
	driver.findElement(By.cssSelector("body:nth-child(2) div.navbar:nth-child(7) ul.navbarul li.getahead:nth-child(7) > a:nth-child(1)")).click();
}
@Test(priority=17)
public void clickOnRealTimeNews() {
	driver.findElement(By.cssSelector("body:nth-child(2) div.navbar:nth-child(7) ul.navbarul li.news:nth-child(8) > a:nth-child(1)")).click();
}
@Test(priority=18)
public void clickOnIPL_Link() {
	driver.findElement(By.cssSelector("body:nth-child(2) div.navbar:nth-child(7) ul.navbarul li:nth-child(9) > a:nth-child(1)")).click();
}
@Test(priority=19)
public void clickOnLeatestLink() {
	driver.findElement(By.cssSelector("div.red_container:nth-child(8) div.firstrow:nth-child(1) div.secstorybox.topboxheight.topstories div.tabtable:nth-child(1) > div.tabs:nth-child(2")).click();
}
@Test(priority=20)
public void clickOnForYouLink() {
	driver.findElement(By.cssSelector("#lasttab")).click();
}
@Test(priority=21)
public void clickOnBagsandLuggageLink() {
	driver.findElement(By.cssSelector("body > div.logobar > div > div.cell.topicons > a.shopicon.relative")).click();
	driver.findElement(By.cssSelector("#popular_cat > h3:nth-child(3) > a")).click();
}
@Test(priority=22)
public void clickOnCameraAndOpticsLink() {
	driver.findElement(By.cssSelector("body > div.logobar > div > div.cell.topicons > a.shopicon.relative")).click();
	driver.findElement(By.cssSelector("#popular_cat > h3:nth-child(4) > a")).click();
}
@Test(priority=23)
public void clickOnCarAndBikeAccessoriesLink() {
	driver.findElement(By.cssSelector("body > div.logobar > div > div.cell.topicons > a.shopicon.relative")).click();
	driver.findElement(By.cssSelector("#popular_cat > h3:nth-child(5) > a")).click();
}
@Test(priority=24)
public void clickOnComputersAndITLink() {
	driver.findElement(By.cssSelector("body > div.logobar > div > div.cell.topicons > a.shopicon.relative")).click();
	driver.findElement(By.cssSelector("#popular_cat > h3:nth-child(6) > a")).click();
}
@Test(priority=25)
public void clickOnFaithAndBeliefsLink() {
	driver.findElement(By.cssSelector("body > div.logobar > div > div.cell.topicons > a.shopicon.relative")).click();
	driver.findElement(By.cssSelector("#popular_cat > h3:nth-child(7) > a")).click();
}
@Test(priority=26)
public void clickOnHomeAppliancesLink() {
	driver.findElement(By.cssSelector("body > div.logobar > div > div.cell.topicons > a.shopicon.relative")).click();
	driver.findElement(By.cssSelector("#popular_cat > h3:nth-child(8) > a")).click();
}
@Test(priority=27)
public void clickOnJewelleryLink() {
	driver.findElement(By.cssSelector("body > div.logobar > div > div.cell.topicons > a.shopicon.relative")).click();
	driver.findElement(By.cssSelector("#popular_cat > h3:nth-child(9) > a")).click();

}
@Test(priority=28)
public void clickOnKitchenLink() {
	driver.findElement(By.cssSelector("body > div.logobar > div > div.cell.topicons > a.shopicon.relative")).click();
	driver.findElement(By.cssSelector("#popular_cat > h3:nth-child(10) > a")).click();

}
@Test(priority=29)
public void clickOnOfficeProductsLink() {
	driver.findElement(By.cssSelector("body > div.logobar > div > div.cell.topicons > a.shopicon.relative")).click();
	driver.findElement(By.cssSelector("#popular_cat > h3:nth-child(11) > a")).click();

}
@Test(priority=30)
public void clickOnSportLink() {
	driver.findElement(By.cssSelector("body > div.logobar > div > div.cell.topicons > a.shopicon.relative")).click();
	driver.findElement(By.cssSelector("#popular_cat > h3:nth-child(12) > a")).click();

}
@Test(priority=31)
public void clickOnToysAndGamesLink() {
	driver.findElement(By.cssSelector("body > div.logobar > div > div.cell.topicons > a.shopicon.relative")).click();
	driver.findElement(By.cssSelector("#popular_cat > h3:nth-child(13) > a")).click();

}
@Test(priority=32)
public void clickOnPetSuppliesLink() {
	driver.findElement(By.cssSelector("body > div.logobar > div > div.cell.topicons > a.shopicon.relative")).click();
	driver.findElement(By.cssSelector("#popular_cat > h3:nth-child(14) > a")).click();

}
@Test(priority=33)
public void clickOnWriteMailLink() {
driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.mailicon")).click();
    driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.findElement(By.cssSelector("#boxscroll > li.rd_write > a > b")).click();
}
@Test(priority=34)
public void clickOnInboxLink() {
driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.mailicon")).click();
    driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.findElement(By.cssSelector("#boxscroll > li.Inbox_icon.is_folder > a")).click();
}
@Test(priority=35)
public void clickOnBulkLink() {
driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.mailicon")).click();
    driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.findElement(By.cssSelector("#boxscroll > li.fld_icon.is_folder")).click();
}
@Test(priority=36)
public void clickOnSentLink() {
driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.mailicon")).click();
    driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.findElement(By.cssSelector("#boxscroll > li.Sent_messages_icon.is_folder > a")).click();
}
@Test(priority=37)
public void clickOnTrashLink() {
driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.mailicon")).click();
    driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.findElement(By.cssSelector("#boxscroll > li.Trash_icon.is_folder > a")).click();
}
@Test(priority=38)
public void clickOnDraftsLink() {
driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.mailicon")).click();
    driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.findElement(By.cssSelector("#boxscroll > li.Drafts_icon.is_folder > a")).click();
}
@Test(priority=39)
public void clickOnFoldersLink() {
driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.mailicon")).click();
    driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.findElement(By.cssSelector("#boxscroll > li.rd_personal_lbl > a > b")).click();
}
@Test(priority=40)
public void clickOnAddressBookLink() {
driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.mailicon")).click();
    driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.findElement(By.cssSelector("#mail_main_box_cont > div.rd_lft_widget > div.rd_mlnav > div.side_btm > div.rd_wid2 > h4")).click();
}
@Test(priority=41)
public void clickOnCalendarLink() {
driver.findElement(By.cssSelector("body:nth-child(2) div.logobar:nth-child(4) div.table div.cell.topicons:nth-child(2) > a.mailicon")).click();
    driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.findElement(By.cssSelector("#mail_main_box_cont > div.rd_lft_widget > div.rd_mlnav > div.side_btm > div.rd_wid3 > h4")).click();
}


	
@AfterMethod
public void aftermethod() {
driver.quit();
}


}
