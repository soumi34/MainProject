package testScript;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {

	@Test

	public void verifiedUserIsAbleToSubmitManageCategory() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignInButton();
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.clickOnMoreInfoButton();
		managecategorypage.clickOnNewButton();
		String field = "Flowers";
		managecategorypage.enterTheCategory(field);
		managecategorypage.clickOnTheDiscountButton();
		String file = "C:\\Users\\Gowrish\\Downloads\\pexels-mariannaole-757889.jpg";
		managecategorypage.clickOnTheFile(file);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		managecategorypage.clickOnSaveButton();
		boolean successpage=managecategorypage.isSuccessMessageDisplayed();
		Assert.assertTrue(successpage);

	}

}
