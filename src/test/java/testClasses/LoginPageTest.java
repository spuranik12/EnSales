package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;
import pageClasses.HomePage;
import pageClasses.LoginPage;
import utilities.DataProviderClass;

public class LoginPageTest extends BaseTest {

	String UserName = "Welcome, Pradip Sudke";

	LoginPage lp;
	HomePage hp;

	@Test(priority = 1, dataProvider = "Valid Login Detials", dataProviderClass = DataProviderClass.class)
	public void loginWithValidInfo(String uname, String pwd){
		lp = new LoginPage(driver);
		Assert.assertTrue(lp.isLoginPageDisplayed());
		lp.loginWithValidCredentials(uname, pwd);
		hp = new HomePage(driver);
		if(!hp.verifyLoggedInUser().equals(UserName)) {
			System.out.println("Invalid Logged-In User");
		}
		else {
			System.out.println("Login successfull.");
		}
	}
	
	@Test(priority = 2)
	public void openEnsalesModule() {
		hp = new HomePage(driver);
		hp.clickEnsalesLink();
	}
}
