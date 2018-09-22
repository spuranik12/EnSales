package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.BasePage;

public class HomePage extends BasePage {

	@FindBy(xpath = "//a[.='Welcome, Pradip Sudke']")
	public WebElement loggedInUser;
	
	@FindBy(css = "li.dropdown.active-navbg > a")
	private WebElement selectModule;
	
	@FindBy(css = "a.clsSales")
	private WebElement salesLink;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public String verifyLoggedInUser() {
		actions.applyDefaultImplicitWait();
		System.out.println(loggedInUser.getText());
		return loggedInUser.getText();
	}
	
	public void clickEnsalesLink() {
		actions.applyDefaultImplicitWait();
		selectModule.click();
		actions.applyDefaultImplicitWait();
		salesLink.click();
	}
}
