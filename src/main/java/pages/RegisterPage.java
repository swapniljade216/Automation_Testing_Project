package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBase;
import utility.UtilityClass;

public class RegisterPage extends StepBase {     //Inheritance
	// This is (POM) Page object model

	UtilityClass objUtilityClass = new UtilityClass();

	@FindBy(xpath = "(//*[@class='form-control'])[1]")
	WebElement FirstName;          // We can use Encapsulation in FindBy.

	@FindBy(xpath = "(//*[@type='text'])[2]")
	WebElement lastName;

	@FindBy(xpath = "//*[@placeholder='UserName']")
	WebElement UserName;

	@FindBy(xpath = "//*[@placeholder='Password']")
	WebElement password;

	@FindBy(xpath = "(//*[@type='submit'])[1]")
	WebElement registerbutton;

	@FindBy(xpath = "(//*[@type='submit'])[2]")
	WebElement BackLogin;


	public RegisterPage() {

		PageFactory.initElements(driver, this);    //This is Constructors
		// It is also used to initialize Page class elements without using “FindElement

	}

	public void RegisterMethod() {

		String FirstN = "Ajay";
		String LastN = "Patil";
		String UserN = "ajaypatil99@gmail.com";
		String Pass = "ajaypatil99@gmail.com";


		objUtilityClass.SendKeywebElement(FirstName, FirstN);
		objUtilityClass.SendKeywebElement(lastName, LastN);
		objUtilityClass.SendKeywebElement(UserName, UserN);
		objUtilityClass.SendKeywebElement(password, Pass);
		objUtilityClass.ClickOnWebElements(registerbutton, 30);
		objUtilityClass.ClickOnWebElements(BackLogin, 20);


	}



}
