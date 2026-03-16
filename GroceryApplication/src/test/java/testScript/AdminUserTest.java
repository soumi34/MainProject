package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base {
	@Test (priority=1,description="User is able to submit Manage News")

	public void verifiedUserIsAbleToSubmitManageNews() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignInButton();
		AdminUserPage adminuserpage = new AdminUserPage(driver);
		adminuserpage.clickOnMoreInfoButton();
		adminuserpage.clickOnNewButton();
		String name = "Nirved";
		String pwd = "1234";
		adminuserpage.enterTheUsername(name);
		adminuserpage.enterThePassword(pwd);
		adminuserpage.clickOnTheDropdown();
		adminuserpage.dropDown();
		adminuserpage.clickOnSaveButton();
		boolean successpage = adminuserpage.isSuccessMessageDisplayed();
		Assert.assertTrue(successpage);

	}
}
