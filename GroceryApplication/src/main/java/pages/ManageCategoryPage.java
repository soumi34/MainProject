package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;

public class ManageCategoryPage {

	public WebDriver driver;
	@FindBy(xpath = "//div[@class='small-box bg-info']//following::p[text()='Manage Category']//following::a[text()='More info '][1]")
	WebElement moreinfo;
	@FindBy(xpath = "//a[text()=' New']")
	WebElement newbutton;
	@FindBy(xpath = "//input[@placeholder='Enter the Category']")
	WebElement category;
	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement discountbutton;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement choosefile;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successmessage;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnMoreInfoButton() {
		moreinfo.click();
	}

	public void clickOnNewButton() {
		newbutton.click();
	}

	public void enterTheCategory(String field) {
		category.sendKeys(field);
	}

	public void clickOnTheDiscountButton() {
		discountbutton.click();
	}

	public void clickOnTheFile(String file)

	{
		choosefile.sendKeys(file);
	}

	public void clickOnSaveButton() {
		savebutton.click();
	}
	public boolean isSuccessMessageDisplayed()
	{
		return successmessage.isDisplayed();
	}
}
