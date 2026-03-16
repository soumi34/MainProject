package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage {

	public WebDriver driver;
	@FindBy(xpath = "//div[@class='small-box bg-info']//following::p[text()='Manage Contact']//following::a[text()='More info '][1]")
	WebElement moreinfo;
	@FindBy(xpath = "//a[@role='button']")
	WebElement updatebutton;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone;
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement submit;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successmessage;

	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnMoreInfoButton() {
		moreinfo.click();
	}

	public void clickOnUpdateButton() {
		updatebutton.click();
	}

	public void clickOnThePhoneField(String phonefeild, String emailfeild) {
		phone.clear();
		phone.sendKeys(phonefeild);
		email.clear();
		email.sendKeys(emailfeild);
	}

	public void clickOnTheSubmitButton() {
		submit.click();
	}

	public boolean isSuccessMessageDisplayed() {
		return successmessage.isDisplayed();
	}

}
