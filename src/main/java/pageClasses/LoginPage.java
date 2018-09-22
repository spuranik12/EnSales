package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(css = "#UserName")
	private WebElement emailIdField;

	@FindBy(css = "#Password")
	private WebElement passwordField; 

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;

	@FindBy(xpath = "//h4[@class='login-heading']")
	private WebElement loginPageHeader;
	
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	public boolean isLoginPageDisplayed(){
		actions.applyDefaultImplicitWait();
		return loginBtn.isDisplayed();  
	}
	
	public void loginWithValidCredentials(String username, String password){
		actions.applyImplicitWait(10);
		emailIdField.sendKeys(username);
		actions.applyDefaultImplicitWait();
		passwordField.sendKeys(password); 
		actions.waitElementToBeClickable(loginBtn, 5);
		loginBtn.click();
	}

}
