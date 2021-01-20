package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBae.Base;


public class CustomerOrder extends Base{
	
	@FindBy(xpath = "//span[@class='item-text ng-scope'][text()='Change Your Location']")
	WebElement ChangeYourLocation;
	
	@FindBy(xpath = "//input[@aria-label='Enter your zip code, city or state']")
	WebElement ZipCityStateFeild;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SearchBtn;
	
	@FindBy(xpath ="//input[@id='pref-radio-195500281483-en-us']")
	WebElement radio;
	
	@FindBy(xpath = "//*[@id='restaurant-locator-195500281483-en-us']/div[3]/div[2]/a)")
	WebElement OrderMcDeliveryBtn;
	
	@FindBy(xpath ="//input[@value='DoorDash']")
	WebElement radio2;
	
	@FindBy(id ="order-now-continue")
	WebElement ContinuBtn;
	
		
	@FindBy(xpath = "//input[@placeholder='Address']")
	WebElement AddressFelid;
	
	@FindBy(xpath = "//button[@class='sc-ksfqlt xferK']")
	WebElement SaveBtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/div/div[3]/div[4]/div[2]/div[5]/button/div/div/span/div/div")
	WebElement DoorDashSelectBtn;
	
	@FindBy(xpath = "//div[@class='sc-bxivhb eEHONp']")
	WebElement AddToCartBtn;
	
	@FindBy(xpath = "//div[@class='sc-bxivhb eEHONp']")
	WebElement CheakOutBut;
	
	public CustomerOrder(){
		PageFactory.initElements(driver, this);
	}
	
	public void ClickChangeLocation() {
		ChangeYourLocation.click();
	}	
		
	public void enterZipCity(String zipcode) {
		ZipCityStateFeild.sendKeys(zipcode);
		}	
	
	public void clickSearchBtn() {
		SearchBtn.click();
	}
	
	public void clickRadio1() {
		radio.click();
	}
	
	public void ClickOrderMCdelivery() {
		OrderMcDeliveryBtn.click();
		
	}
	public void clickRadio2() {
		radio2.click();
	}
	
	public void clickContinuBtn() {
		ContinuBtn.click();
	}
	
	public void EnterAddress(String address) {
	AddressFelid.sendKeys(address);
	}
	
	public void clickSaveBtn() {
		SaveBtn.click();
		
	}
	
	public void addDoorDashSelection() {
		DoorDashSelectBtn.click();
	}
	
	public void clickAddToCart() {
		AddToCartBtn.click();
	}
	
	public void clickCheakOut() {
		CheakOutBut.click();
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
}
