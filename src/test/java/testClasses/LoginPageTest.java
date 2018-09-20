package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;
import pageClasses.LoginPage;
import utilities.DataProviderClass;

public class LoginPageTest extends BaseTest {
	
	@Test(priority = 1, dataProvider = "Valid Login Detials", dataProviderClass = DataProviderClass.class)
	public void loginWithValidInfo(String uname, String pwd){ 
		LoginPage lp = new LoginPage(driver);
//		Assert.assertTrue(lp.isLoginPageDisplayed());
//		System.out.println();
		lp.loginWithValidCredentials(uname, pwd);
//		Assert.assertTrue(lp.isLoginPageDisplayed());
//		System.out.println(lp.displayInavlidMessage());
//		Assert.assertTrue(lp.isInvalidLoginMessageDisplayed());
	}
}
