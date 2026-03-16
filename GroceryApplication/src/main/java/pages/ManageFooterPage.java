package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageFooterPage {

	public WebDriver driver;
	@FindBy(xpath = "//div[@class='small-box bg-info']//following::p[text()='Manage Footer Text']//following::a[text()='More info '][1]")
	WebElement moreinfo;

}
