package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends LoginTest {
	@Test(priority = 1, description = "User is able to submit Manage contact")

	public void verifiedUserIsAbleToSubmitManageContact() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignInButton();
		ManageContactPage managecontactpage = new ManageContactPage(driver);
		managecontactpage.clickOnMoreInfoButton();
		managecontactpage.clickOnUpdateButton();
		String phonefeild = "7293081469";
		String emailfeild = "demo@mailto.plus";
		managecontactpage.clickOnThePhoneField(phonefeild, emailfeild);
		managecontactpage.clickOnTheSubmitButton();
		boolean successpage = managecontactpage.isSuccessMessageDisplayed();
		Assert.assertTrue(successpage);
	}
}
