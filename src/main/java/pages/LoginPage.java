package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBase;
import utility.UtilityClass;

public class LoginPage extends StepBase {

	UtilityClass objUtilityClass = new UtilityClass();

	// This is (POM) Page object model..
	//Pom help to create a framework for maintainig selenium scripts.

	@FindBy(xpath = "//*[@placeholder='UserName']")
	WebElement UserName;

	@FindBy(xpath = "//*[@type='password']")
	WebElement password;

	@FindBy(xpath = "(//*[@type='submit'])[1]")
	WebElement LoginButton;




	public LoginPage() {
		PageFactory.initElements(driver, this);

		//Page Factory is a factory class that extends from the web driver classes and is an optimized version of the Page Object Model (POM).
	}

	public void LoginMethod() {

		String UserN = "ajaypatil99@gmail.com";
		String Pass = "Aj@123";


		objUtilityClass.SendKeywebElement(UserName, UserN);
		objUtilityClass.SendKeywebElement(password, Pass);
		objUtilityClass.ClickOnWebElements(LoginButton, 30);

	}

}
